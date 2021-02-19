import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
 
public class CircleDraw extends Applet implements MouseListener
{
    int x = 0;
    int y = 0;
    public void init()
    {
        
        addMouseListener(this);
    }
    public void mouseClicked (MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
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
       Color c = new Color((int)(Math.random()*255+1),(int)(Math.random()*255+1),(int)(Math.random()*255+1));
       g.setColor(c);
       int a = ((int)(Math.random()*500+1));
        g.fillOval(x-(a/2),y-(a/2),a,a);
    }
}