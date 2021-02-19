
/**
 * Write a description of class PACman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.awt.*;
public class PACman
{
    private int x;
    private int y;
    private int s;
    private Color color;

    /**
     * Constructor for objects of class PACman
     */
    public PACman(int x, int y, int s, Color color)
    {
        this.x = x;
        this.y = y;
        this.s = s;
        this.color = color;
    } 
    public int gX(){return x;}
    public int gY(){return y;}
    public int gS(){return s;}
    public void draw(Graphics j)
    {
        j.setColor(color);
        j.fillArc(x,y,s,s,45, 270);
    }
    
    
}
