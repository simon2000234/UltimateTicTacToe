/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimatetictactoe.move;

/**
 *
 * @author Melchertsen
 */
public class Move implements IMove
{

    private int x;
    private int y;

    @Override
    public int getX()
    {
        return x;
    }

    @Override
    public int getY()
    {
        return y;   
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
