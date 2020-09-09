

/**
 * Class rainbow - write a description of the class here
 * Rainbow (JS2 Graphics): Use the graphics methods (fillRect, fillOval, fillArc, setColor)
 * you have learned to create a rainbow! Make sure there are six colors in your rainbow: red,
 * orange, yellow, green, blue, and magenta.
 * @author (AaronD) 
 * @version (a version number)
 */
import java.awt.*;//color in and lots of things
import java.applet.Applet;

public class rainbow extends Applet
{
    public void paint(Graphics j) {
        /** methods
         * fillRect(int x, int y, int w, int h)
         * setColor(Color c) ex: Color.yellow
         * fillOval(int x, int y, int w, int h)
         * fillArc(int x, int y, int w, int h, int startAngle, int arcAngle)
        */
       j.setColor(Color.red);
       j.fillArc(75,775,350,325,360,180);
       j.setColor(Color.orange);
       j.fillArc(100,800,300,275,360,180);
       j.setColor(Color.yellow);
       j.fillArc(125,825,250,225,360,180);
       j.setColor(Color.green);
       j.fillArc(150,850,200,175,360,180);
       j.setColor(Color.blue);
       j.fillArc(175,875,150,125,360,180);
       j.setColor(Color.magenta);
       j.fillArc(200,900,100,75,360,180);
       
       
       
        
        
    }
}