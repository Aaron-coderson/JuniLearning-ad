

/**
 * Class BasicShapes - write a description of the class here
 * 
 * @author (AaronD) 
 * @version (a version number)
 */
import java.awt.*;//color in and lots of things
import java.applet.Applet;

public class pac extends Applet
{
    public void paint(Graphics j) {
        /** methods
         * fillRect(int x, int y, int w, int h)
         * setColor(Color c) ex: Color.yellow
         * fillOval(int x, int y, int w, int h)
         * fillArc(int x, int y, int w, int h, int startAngle, int arcAngle)
        */
       //smile
        j.setColor(Color.black);//seting color
        j.fillRect(200,20,50,200);//first eye
        j.fillRect(400,20,50,200);//second eye
        j.fillArc(100,200,400,200,180,180);//mouth
        
        //pac1
        j.setColor(Color.yellow);
        j.fillOval(75,500,200,200);
        
        j.setColor(Color.white);
        j.fillArc(75,500,200,200,40,-90);
        
        //pac2
        
        j.setColor(Color.yellow);
        j.fillArc(275,500,200,200,140,-275);
        
        
        
    }
}