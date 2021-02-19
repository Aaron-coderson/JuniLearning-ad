import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class bGame extends Applet implements Runnable, KeyListener
{   
    Thread t = null;
    b current;
    b[][] grid = new b[20][20];
    //int a;
    boolean change = false;
    int loR = 0;
    //int i;
    public void start()
    {
        t = new Thread(this);
        t.start();
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
            current = new b(a, i, c);
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
                    grid[cr][cc+1] = current;
                    grid[cr][cc] = null;
                    current.sC(cc+1);

                }
                //i++;
                repaint();
                try {Thread.sleep(100);} // input whatever amount of time you want
                catch(Exception e) {
                }
            }

        }
    }


    public void init()
    {
        addKeyListener(this);
        setBackground(Color.black);
    }
    
    
 
    public void keyPressed(KeyEvent e)
    {
        // your code goes here
        int key = e.getKeyCode();
        int cr = current.gR();
        int cc = current.gC();
        
        if (key == KeyEvent.VK_LEFT && cr>0&&grid[cr-1][cc]==null)
        {
            grid[cr][cc] = null;
            //grid[cr][cc+1] = null;
            grid[cr-1][cc]=current;
            current.sR(cr-1);
            //current.sC(cc+1);
        }
        else if (key == KeyEvent.VK_RIGHT&& cr<19&&grid[cr+1][cc]==null)
        {
            grid[cr][cc] = null;
            //grid[cr][cc+1] = null;
            grid[cr+1][cc]=current;
            current.sR(cr+1);
            //current.sC(cc-1);
        }
        repaint();
    } 
  
    public void keyReleased (KeyEvent e) {}
    
    public void keyTyped (KeyEvent e) {}

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