import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class fallB extends Applet implements Runnable
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

            int i = 0;

            int ro = (int)(Math.random()*256);
            int go = (int)(Math.random()*256);
            int bo = (int)(Math.random()*256);
            Color c = new Color(ro,go,bo);
            int a = (int)(Math.random()*20);
            b current = new b(a, i, c);
            grid[a][i] = current;
            while(true)
            {
                int cr = current.gR();
                int cc = current.gC(); 

                if(((cc==19))||((grid[cr][cc+1])!=null))
                {
                    break;
                }
                else
                {
                    grid[a][i+1] = current;
                    grid[a][i] = null;
                    current.sC(i+1);

                }
                i++;
                repaint();
                try {Thread.sleep(100);} // input whatever amount of time you want
                catch(Exception e) {
                }
            }

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