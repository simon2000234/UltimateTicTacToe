/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.field;

import field.IField;
import java.util.ArrayList;
import java.util.List;
import move.IMove;

/**
 *
 * @author Caspe
 */
public class UTTTField implements IField
{

    private String[][] macroBoard;
    private String[][] microBoard1;
    private String[][] microBoard2;
    private String[][] microBoard3;
    private String[][] microBoard4;
    private String[][] microBoard5;
    private String[][] microBoard6;
    private String[][] microBoard7;
    private String[][] microBoard8;
    private String[][] microBoard9;
    private ArrayList<String[][]> microBoards = new ArrayList<>();

    public UTTTField()
    {
        macroBoard = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard1 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard2 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard3 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard4 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard5 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard6 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard7 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard8 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
        microBoard9 = new String[][]{{"-1","-1","-1"},{"-1","-1","-1"},{"-1","-1","-1"}};
    }

    @Override
    public void clearBoard()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[][] getMacroboard()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBoard(String[][] board)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMacroboard(String[][] macroboard)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
