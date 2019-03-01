/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.field;

import ultimatetictactoe.field.IField;
import java.util.ArrayList;
import java.util.List;
import ultimatetictactoe.move.IMove;
import ultimatetictactoe.move.Move;

/**
 *
 * @author Caspe
 */
public class UTTTField implements IField
{

    private String[][] macroBoard;
    private String[][] fullBoard;
    private ArrayList<String[][]> microBoards = new ArrayList<>();

    public UTTTField()
    {

        // macroBoard arekryds og bolle the big one
        macroBoard = new String[][]{{"-1","-1","-1"},
                                    {"-1","-1","-1"},
                                    {"-1","-1","-1"}};
        // full board
        fullBoard = new String[][]{{"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"}};
        };

    @Override
    public void clearBoard()
    {
        macroBoard = new String[][]{{"-1","-1","-1"},
                                    {"-1","-1","-1"},
                                    {"-1","-1","-1"}};
        fullBoard = new String[][]{{"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"},
                                   {"-1","-1","-1","-1","-1","-1","-1","-1","-1"}};
    }

    @Override
    public List<IMove> getAvailableMoves()
    {
        ArrayList<IMove> theList = new ArrayList<>();
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if(fullBoard[i][j] == "-1")
                {
                    Move aMove = new Move();
                    aMove.setX(i);
                    aMove.setY(j);
                    theList.add(aMove);
                }
                
            }
            
        }
        return theList;
    }

    @Override
    public String getPlayerId(int column, int row)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isFull()
    {
        ArrayList<IMove> theList = new ArrayList<>();
        theList.addAll(getAvailableMoves());
        if(theList.size() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public Boolean isInActiveMicroboard(int x, int y)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] getBoard()
    {
        return fullBoard;
    }

    @Override
    public String[][] getMacroboard()
    {
        return macroBoard;
    }

    @Override
    public void setBoard(String[][] board)
    {
        fullBoard = board;
    }

    @Override
    public void setMacroboard(String[][] macroboard)
    {
        this.macroBoard = macroboard;
    }

}
