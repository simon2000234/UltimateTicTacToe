package ultimatetictactoe.game;

import java.util.ArrayList;
import java.util.List;
import ultimatetictactoe.bot.IBot;
import ultimatetictactoe.move.IMove;

/**
 * This is a proposed GameManager for Ultimate Tic-Tac-Toe, the implementation
 * of which is up to whoever uses this interface. Note that initializing a game
 * through the constructors means that you have to create a new instance of the
 * game manager for every new game of a different type (e.g. Human vs Human,
 * Human vs Bot or Bot vs Bot), which may not be ideal for your solution, so you
 * could consider refactoring that into an (re-)initialize method instead.
 *
 * @author mjl
 */
public class GameManager
{

    /**
     * Three different game modes.
     */
    public enum GameMode
    {
        HumanVsHuman,
        HumanVsBot,
        BotVsBot
    }

    private final IGameState currentState;
    private int currentPlayer = 0; //player0 == 0 && player1 == 1
    private GameMode mode = GameMode.HumanVsHuman;
    private IBot bot = null;
    private IBot bot2 = null;

    /**
     * Set's the currentState so the game can begin. Game expected to be played
     * Human vs Human
     *
     * @param currentState Current game state, usually an empty board, but could
     * load a saved game.
     */
    public GameManager(IGameState currentState)
    {
        this.currentState = currentState;
        mode = GameMode.HumanVsHuman;
    }

    /**
     * Set's the currentState so the game can begin. Game expected to be played
     * Human vs Bot
     *
     * @param currentState Current game state, usually an empty board, but could
     * load a saved game.
     * @param bot The bot to play against in vsBot mode.
     */
    public GameManager(IGameState currentState, IBot bot)
    {
        this.currentState = currentState;
        mode = GameMode.HumanVsBot;
        this.bot = bot;
    }

    /**
     * Set's the currentState so the game can begin. Game expected to be played
     * Bot vs Bot
     *
     * @param currentState Current game state, usually an empty board, but could
     * load a saved game.
     * @param bot The first bot to play.
     * @param bot2 The second bot to play.
     */
    public GameManager(IGameState currentState, IBot bot, IBot bot2)
    {
        this.currentState = currentState;
        mode = GameMode.BotVsBot;
        this.bot = bot;
        this.bot2 = bot2;
    }

    /**
     * User input driven Update
     *
     * @param move The next user move
     * @return Returns true if the update was successful, false otherwise.
     */
    public Boolean updateGame(IMove move)
    {
        //Verify the new move
        if (!verifyMoveLegality(move))
        {
            return false;
        }

        //Update the currentState
        updateBoard(move);
        updateMacroboard(move);

        if (checkForWin(move) >= 0)
        {
            checkforMacroWin();
        }

        //Update currentPlayer
        currentPlayer = (currentPlayer + 1) % 2;

        return true;
    }

    /**
     * Non-User driven input, e.g. an update for playing a bot move.
     *
     * @return Returns true if the update was successful, false otherwise.
     */
    public Boolean updateGame()
    {
        //Check game mode is set to one of the bot modes.
        assert (mode != GameMode.HumanVsHuman);

        //Check if player is bot, if so, get bot input and update the state based on that.
        if (mode == GameMode.HumanVsBot && currentPlayer == 1)
        {
            //Check bot is not equal to null, and throw an exception if it is.
            assert (bot != null);

            IMove botMove = bot.doMove(currentState);

            //Be aware that your bots might perform illegal moves.
            return updateGame(botMove);
        }

        //Check bot is not equal to null, and throw an exception if it is.
        assert (bot != null);
        assert (bot2 != null);

        //TODO: Implement a bot vs bot Update.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private Boolean verifyMoveLegality(IMove move)
    {
        List<IMove> theList = new ArrayList<>();

        theList = currentState.getField().getAvailableMoves();

        for (int i = 0; i < theList.size(); i++)
        {
            if (theList.get(i).getX() == move.getX() && theList.get(i).getY() == move.getY())
            {
                return true;
            }
        }
        return false;
    }

    private void updateBoard(IMove move)
    {
        if (currentPlayer == 1)
        {
            currentState.getField().getBoard()[move.getX()][move.getY()] = "1";
        } else if (currentPlayer == 0)
        {
            currentState.getField().getBoard()[move.getX()][move.getY()] = "0";

        }
    }

    private void updateMacroboard(IMove move)
    {
        //TODO: Update the macroboard to the new state 
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getCurrentPlayer()
    {
        return currentPlayer;
    }

    public int checkForWin(IMove move)
    {
        int playerWon = -1;
        int mbX = mbXsetter(move);
        int mbY = mbYsetter(move);
        String gameBoard[][] = currentState.getField().getBoard();
        if (mbX >= 0 && mbY >= 0)
        {
            for (int j = 0; j <= 2; j++)
            {
                if (!gameBoard[j + mbX][0 + mbY].equals("-1") && gameBoard[j + mbX][0 + mbY].equals(gameBoard[j + mbX][1 + mbY]) && gameBoard[j + mbX][1 + mbY].equals(gameBoard[j + mbX][2 + mbY]))
                {
                    playerWon = Integer.parseInt(gameBoard[j + mbX][0 + mbY]);
                    currentState.getField().getMacroboard()[(mbX / 3)][(mbY / 3)] = "" + playerWon;
                    setBoardToWinner(mbX, mbY, gameBoard[j + mbX][0 + mbY]);
                    System.out.println("Winner is Player " + playerWon);
                    return playerWon;
                } else if (!gameBoard[0 + mbX][j + mbY].equals("-1") && gameBoard[0 + mbX][j + mbY].equals(gameBoard[1 + mbX][j + mbY]) && gameBoard[1 + mbX][j + mbY].equals(gameBoard[2 + mbX][j + mbY]))
                {
                    playerWon = Integer.parseInt(gameBoard[0 + mbX][j + mbY]);
                    currentState.getField().getMacroboard()[(mbX / 3)][(mbY / 3)] = "" + playerWon;
                    setBoardToWinner(mbX, mbY, gameBoard[0 + mbX][j + mbY]);
                    System.out.println("Winner is Player " + playerWon);
                    return playerWon;
                } else if (!gameBoard[0 + mbX][0 + mbY].equals("-1") && gameBoard[0 + mbX][0 + mbY].equals(gameBoard[1 + mbX][1 + mbY]) && gameBoard[1 + mbX][1 + mbY].equals(gameBoard[2 + mbX][2 + mbY]))
                {
                    playerWon = Integer.parseInt(gameBoard[0 + mbX][0 + mbY]);
                    currentState.getField().getMacroboard()[(mbX / 3)][(mbY / 3)] = "" + playerWon;
                    setBoardToWinner(mbX, mbY, gameBoard[0 + mbX][0 + mbY]);
                    System.out.println("Winner is Player " + playerWon);
                    return playerWon;
                } else if (!gameBoard[0 + mbX][2 + mbY].equals("-1") && gameBoard[0 + mbX][2 + mbY].equals(gameBoard[1 + mbX][1 + mbY]) && gameBoard[1 + mbX][1 + mbY].equals(gameBoard[2 + mbX][0 + mbY]))
                {
                    playerWon = Integer.parseInt(gameBoard[0 + mbX][2 + mbY]);
                    currentState.getField().getMacroboard()[(mbX / 3)][(mbY / 3)] = "" + playerWon;
                    setBoardToWinner(mbX, mbY, gameBoard[0 + mbX][2 + mbY]);
                    System.out.println("Winner is Player " + playerWon);
                    return playerWon;
                }
            }
        }
        System.out.println("The winner (-1 is no winner yet)" + playerWon);
        return playerWon;
    }

    public int mbXsetter(IMove move)
    {
        int mbX = -1;
        //row1
        if (0 <= move.getX() && move.getX() < 3)
        {
            mbX = 0;
        }
        //row2
        if (2 < move.getX() && move.getX() < 6)
        {
            mbX = 3;
        }
        //row3
        if (5 < move.getX() && move.getX() < 9)
        {
            mbX = 6;
        }
        return mbX;
    }

    public int mbYsetter(IMove move)
    {
        int mbY = -1;
        //row1
        if (0 <= move.getY() && move.getY() < 3)
        {
            mbY = 0;
        }
        //row2
        if (2 < move.getY() && move.getY() < 6)
        {
            mbY = 3;
        }
        //row3
        if (5 < move.getY() && move.getY() < 9)
        {
            mbY = 6;
        }
        return mbY;
    }

    public int checkforMacroWin()
    {
        int playerWon = -1;
        String gameBoard[][] = currentState.getField().getMacroboard();
        for (int j = 0; j <= 2; j++)
        {
            if (!gameBoard[j][0].equals("-1") && gameBoard[j][0].equals(gameBoard[j][1]) && gameBoard[j][1].equals(gameBoard[j][2]))
            {
                playerWon = Integer.parseInt(gameBoard[j][0]);
                System.out.println("PLAYER " + playerWon + " HAS WON THE GAME");
                return playerWon;
            } else if (!gameBoard[0][j].equals("-1") && gameBoard[0][j].equals(gameBoard[1][j]) && gameBoard[1][j].equals(gameBoard[2][j]))
            {
                playerWon = Integer.parseInt(gameBoard[0][j]);
                System.out.println("PLAYER " + playerWon + " HAS WON THE GAME");
                return playerWon;
            } else if (!gameBoard[0][0].equals("-1") && gameBoard[0][0].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][2]))
            {
                playerWon = Integer.parseInt(gameBoard[0][0]);
                System.out.println("PLAYER " + playerWon + " HAS WON THE GAME");
                return playerWon;
            } else if (!gameBoard[0][2].equals("-1") && gameBoard[0][2].equals(gameBoard[1][1]) && gameBoard[1][1].equals(gameBoard[2][0]))
            {
                playerWon = Integer.parseInt(gameBoard[0][2]);
                System.out.println("PLAYER " + playerWon + " HAS WON THE GAME");
                return playerWon;
            }
        }
        return playerWon;
    }

    public void setBoardToWinner(int x, int y, String winner)
    {
        String gameBoard[][] = currentState.getField().getBoard();
        for (int i = 0+x; i < 3+x; i++)
        {
            for (int j = 0+y; j < 3+y; j++)
            {
                gameBoard[i][j] = winner;
                
            }
            
        }
        
    }

}
