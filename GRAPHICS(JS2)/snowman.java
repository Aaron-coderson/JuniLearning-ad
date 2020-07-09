

/**
 * Class snowman - write a description of the class here
 * 
 * @author (AaronD) 
 * @version (a version number)
 */
import java.awt.*;//color in and lots of things
import java.applet.Applet;

public class snowman extends Applet
{
    public void paint(Graphics j) {
        /** methods
         * fillRect(int x, int y, int w, int h)
         * setColor(Color c) ex: Color.yellow
         * fillOval(int x, int y, int w, int h)
         * fillArc(int x, int y, int w, int h, int startAngle, int arcAngle)
        */
       j.setColor(Color.blue);
       j.fillRect(0,0,1500,1500);
       j.setColor(Color.white);
       j.fillOval(500,100,200,200);
       j.fillOval(450,250,300,300);
       j.fillOval(400,400,400,400);
       
       
       
        
        
    }
}