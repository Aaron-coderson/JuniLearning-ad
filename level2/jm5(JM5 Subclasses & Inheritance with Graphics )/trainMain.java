
import java.awt.*;
import java.applet.*;

/**
 * Class trainMain - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class trainMain extends Applet
{
    
    //https://pastebin.com/iYUBeKHt
    //https://pastebin.com/ipz0T6ge
    
    public void paint(Graphics g)
         {
    //         car carA = new car(50,50,Color.red,3);
    //         carA.draw(g);
    
        carSkus carB = new carSkus(50,50,Color.red,1,true,true);
    carB.draw(g);
    }
    
}
