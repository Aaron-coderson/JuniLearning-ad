import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 
public class discof extends Applet implements Runnable
{
    Thread t = null;
    b[][] grid = new b[20][20];

    public void start()
    {
        t = new Thread(this);
        t.start();
        setBackground(Color.black);
    }
 
    public void run()
    {
       while(true)
       {
          int a = (int)(Math.random()*20);
          int d =(int)(Math.random()*20);
          int ro = (int)(Math.random()*256);
           int go = (int)(Math.random()*256);
           int bo = (int)(Math.random()*256);
          Color c = new Color(ro,go,bo);
          grid[a][d] = new b(a,d,c);
          repaint();
           try {Thread.sleep(10);} // input whatever amount of time you want
          catch(Exception e) {}
          
        }
    }
    public void paint(Graphics g) {
       for(int i = 0; i<20; i++)
       {
           for(int o = 0; o<20; o++)
           {
               if(grid[i][o]!=null)
               {
                   g.setColor(grid[i][o].gCo());
               g.fillRect(i*20+10,o*20+10,20,20);
            }
               
            }
        }
    }
}