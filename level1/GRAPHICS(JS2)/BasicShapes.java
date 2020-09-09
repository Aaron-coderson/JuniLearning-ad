

/**
 * Class BasicShapes - write a description of the class here
 * 
 * @author (AaronD) 
 * @version (a version number)
 */
import java.awt.*;//color in and lots of things
import java.applet.Applet;

public class BasicShapes extends Applet
{
    public void paint(Graphics j) {
        /* methods
         * fillRect(int x, int y, int w, int h)
         * setColor(Color c) ex: Color.yellow
         * fillOval(int x, int y, int w, int h)
         * fillArc(int x, int y, int w, int h, int startAngle, int arcAngle)
        */
        j.setColor(Color.red);
        j.fillRect(0,0,100,100);
        j.setColor(Color.cyan);
        //j.fillOval(0,75,150,150);
        //j.fillOval(75,0,150,150);
        j.fillOval(75,75,150,150);
        j.setColor(Color.magenta);
        j.fillArc(50,200,100,100,90,90);
    }
}