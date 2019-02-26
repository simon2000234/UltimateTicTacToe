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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
