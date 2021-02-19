import java.awt.*;
/**
 * Write a description of class train here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carSkus extends car
{
    // instance variables - replace the example below with your own
    private boolean w1;//w1
    private boolean ch;//chim
    /**
     * Constructor for objects of class train
     */
    public carSkus(int x, int y, Color c, int n, boolean w1, boolean ch)
    {
       super(x,y,c,n);
       this.w1 = w1;
       this.ch = ch;
    }
    public void draw(Graphics j)
    {
        
        super.draw(j);
        j.setColor(Color.blue);
        int x = gX();
        int y = gY();
        if(w1==true){j.fillRect((x+(50)),y+100,300,150);}
        if(ch==true){j.fillRect((x+(100)),y+(-300),50,310);}
    }
  
}
