/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.game;

import ultimatetictactoe.field.IField;
import ultimatetictactoe.field.UTTTField;

/**
 *
 * @author Melchertsen
 */
public class GameState implements IGameState
{
    private UTTTField field;
    private int moveNumber;
    private int roundNumber;

    public GameState(UTTTField field)
    {
        this.field = field;
    }
    
    @Override
    public IField getField()
    {
        return field;
    }

    @Override
    public int getMoveNumber()
    {
        return moveNumber;
    }

    @Override
    public void setMoveNumber(int moveNumber)
    {
        this.moveNumber = moveNumber;
    }

    @Override
    public int getRoundNumber()
    {
        return roundNumber;
    }

    @Override
    public void setRoundNumber(int roundNumber)
    {
        this.roundNumber = roundNumber;
    }
    
}
