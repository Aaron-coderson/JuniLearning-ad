

//import java.awt.*;//color in and lots of things
import java.awt.*;//color in and lots of things
import java.applet.Applet;

/**
 * Class picaso - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class picaso extends Applet
{

    public void paint(Graphics j)
    {
        for(int i =0; i<500; i++)
        {
            j.setColor(new Color(((int)(255*Math.random())),((int)(255*Math.random())),((int)(255*Math.random()))));
            j.fillRect(((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())));

        
        
        }
        int x = 0;
        for(int k =0; k<1000; k++)
        {
            x = (int)((Math.random()*1)+2);
            if(x==1)
            {
                j.setColor(new Color(((int)(255*Math.random())),((int)(255*Math.random())),((int)(255*Math.random()))));
                j.fillOval(((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())));

            }
            if(x==2)
            {
                j.setColor(new Color(((int)(255*Math.random())),((int)(255*Math.random())),((int)(255*Math.random()))));
                j.fillArc(((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())),((int)(500*Math.random())));

            }        
        }
    }
}

