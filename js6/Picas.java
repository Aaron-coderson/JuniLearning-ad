

/**
 * Class BasicShapes - write a description of the class here
 * 
 * @author (AaronD) 
 * @version (a version number)
 */
import java.awt.*;//color in and lots of things
import java.applet.Applet;
public class Picas extends Applet
{
    /* 
         * fillRect(int x, int y, int w, int h)
         * setColor(Color c) ex: Color.yellow
         * fillOval(int x, int y, int w, int h)
         * fillArc(int x, int y, int w, int h, int startAngle, int arcAngle)
        */
 
    public static void s1(Graphics j) {
   
       
       
           j.setColor(new Color(((int)(255*Math.random())),((int)(255*Math.random())),((int)(255*Math.random()))));
           j.fillRect(((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())));

     
       
    }
    public static void s2(Graphics l)
    {
         l.setColor(new Color(((int)(255*Math.random())),((int)(255*Math.random())),((int)(255*Math.random()))));
         l.fillOval(((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())));

    }
    public static void s3(Graphics k)
    {
        k.setColor(new Color(((int)(255*Math.random())),((int)(255*Math.random())),((int)(255*Math.random()))));
        k.fillArc(((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())),((int)(1000*Math.random())));
    }
    }