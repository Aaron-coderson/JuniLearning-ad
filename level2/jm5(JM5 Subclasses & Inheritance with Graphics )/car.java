import java.awt.*;
/**
 * Write a description of class train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Color c;
    private int n;
    /**
     * Constructor for objects of class train
     */
    public car(int x, int y, Color c, int n)
    {
       this.x = x;
       this.y = y; 
       this.c = c;
       this.n = n;
    }
    public void draw(Graphics j)
    {
        for(int i = 0; i<n; i++)
        {
            j.setColor(c);
            j.fillRect(x+(650*i),y,600,300);
            j.setColor(Color.black);
            j.fillOval(x+50+(650*i),y+275,150,150);
            j.fillOval(x+350+(650*i),y+275,150,150);
        }
    }
    public int gX(){return x;}
    public int gY(){return y;}
}
