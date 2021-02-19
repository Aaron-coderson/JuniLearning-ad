import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 
public class dBall extends Applet implements Runnable
{
    Thread t = null;
    int x = 25;
    int y = 25;
    int ro = 0;
    int go = 0;
    int bo = 0;
    
    public void start()
    {
        t = new Thread(this);
        t.start();
    }
 
    public void run()
    {
       while(true)
       {
           ro = (int)(Math.random()*256);
           go = (int)(Math.random()*256);
           bo = (int)(Math.random()*256);
           repaint();
           try {Thread.sleep(1000);} // input whatever amount of time you want
          catch(Exception e) {}
          
        }
    }
    public void paint(Graphics g) {
       Color c = new Color(ro,go,bo);
       g.setColor(c);
       g.fillOval(x,y,250,250);
    }
}