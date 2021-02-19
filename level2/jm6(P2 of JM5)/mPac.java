import java.awt.*;
/**
 * Write a description of class mPac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mPac extends PACman
{
    
    
    private Color bC;
    public mPac(int x, int y, int s, Color color, Color bC)
    {
          super(x,y,s,color);
       this.bC = bC;
    }

    public void draw(Graphics j){
        int x = gX();
        int y = gY();
        int s = gS();
        super.draw(j);
        j.setColor(bC);
        j.fillRect(x,y-50,s+10,60);
        j.fillRect(x+10,y-250,s,280);
        
        /* *
         * j.drawLine(startx, starty, endx, endy)
*/
    }

}
