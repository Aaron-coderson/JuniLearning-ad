import java.awt.*;
import java.applet.*;
import java.awt.event.*;
 //HW::::::::::::::::::::
 //Instruct: https://pastebin.com/NGpiYdH9
 //Template: https://pastebin.com/af1kpJxt
public class PMEater extends Applet implements KeyListener
{
    int x = 250;
    int y = 250;
    int choice = 0;
    int score = 0;
    int Bx = 10;
    int By = 10;
    int sA = 45;
    int s = 50;
    int a = 0;
    public void init()
    {
        addKeyListener(this);
        setBackground(Color.black);
    }
 
    public void keyPressed(KeyEvent e)
    {
        // your code goes here
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_UP)
        {
            y+=-10;
            sA = 135;
            
        }
        else if (key == KeyEvent.VK_DOWN)
        {
            y+=10;
            sA = -45;
            
        }
        else if (key == KeyEvent.VK_LEFT)
        {
            x+=-10;
            sA = -135;
            
        }
        else if (key == KeyEvent.VK_RIGHT)
        {
            x+=10;
            sA = 45;
            
        }
        if(key==KeyEvent.VK_Q)
        {
            s+=100; 
            score+= 999999999;
        }
        if(s>=1000){
                
                s = 50;
        }
        repaint();
    } 
    public void keyReleased (KeyEvent e) {}
 
    public void keyTyped (KeyEvent e) {}
 
    public void paint(Graphics g) {
        
        g.setColor(Color.yellow);
        g.fillArc(x,y,s,s,sA, 270);
        
        if(Math.abs((x+(s/2)) - (Bx+15)) <= 15 && Math.abs((y+(s/2)) - (By+15)) <= 15 ){
            Bx=(int)(Math.random()*900 + 10);
            By=(int)(Math.random()*900 + 10);
            s+=10;
            score++;
            
        }
        g.setColor(Color.red);
        g.fillOval(Bx,By,30,30);
        g.setColor(Color.white);
        g.drawString("Score: " + Integer.toString(score), 20, 20);
    }
} 