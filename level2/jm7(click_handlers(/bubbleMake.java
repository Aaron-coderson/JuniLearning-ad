import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
 
public class bubbleMake extends Applet implements MouseListener
{
    int[] x = new int[10];
    int[] y = new int[10];
    int[] s = new int[10];
    Color[] c = new Color[10];
    int index = 0;
    public void init()
    {
        setBackground(Color.blue);
        addMouseListener(this);
    }
    public void mouseClicked (MouseEvent e)
    {
     
        x[index] = e.getX();
        y[index] = e.getY();
        c[index] = new Color((int)(Math.random()*255+1),(int)(Math.random()*255+1),(int)(Math.random()*255+1));
        s[index] = ((int)(Math.random()*500+1));
        index ++;
        if(index == 10){
            index = 0;
        }
        repaint();
    }
    public void mouseEntered (MouseEvent e) {
        //setBackground(Color.blue);
    }
    public void mouseExited (MouseEvent e) {
        //setBackground(Color.red);
    }
    public void mousePressed (MouseEvent e) {}
    public void mouseReleased (MouseEvent e) {}
 
    public void paint(Graphics g)
    {
       for(int i = 0; i<10; i++)
       {
           g.setColor(c[i]);
           g.fillOval(x[i]-(s[i]/2),y[i]-(s[i]/2),s[i],s[i]);
        }
       
    }
}