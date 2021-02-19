
/**
 * Write a description of class b here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
public class b
{
    // instance variables - replace the example below with your own
    private int r;
    private int c;
    private Color color;
    /**
     * Constructor for objects of class b
     */
    public b(int r,int c, Color color)
    {
       this.r=r;
       this.c=c;
       this.color=color;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int gR(){return r;}
    public int gC(){return c;}
    public Color gCo(){return color;}
    public void sR(int a){r=a;}
    public void sC(int b){c=b;}
    public void sCo(Color c){color=c;}
}
