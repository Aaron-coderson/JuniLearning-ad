
import java.awt.*;
import java.applet.*;



/*https://pastebin.com/vqecieb5
 * https://pastebin.com/NKy9TtRL//tc
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
/**
 * Class Main - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Main extends Applet
{
    
    public void paint(Graphics g)
         {
//              PACman p1 = new PACman(0,0,200,Color.red);
//              p1.draw(g);
//              
//              for(int i = 0; i<10; i++)
//              {
//                 Color c = new Color((int)(Math.random()*255+1),(int)(Math.random()*255+1),(int)(Math.random()*255+1));
//                 PACman p = new PACman((int)(Math.random()*1300),(int)(Math.random()*1300),(int)(Math.random()*800), c);  
//                 p.draw(g);
//                 
Color c = new Color((int)(Math.random()*255+1),(int)(Math.random()*255+1),(int)(Math.random()*255+1));                    
Color c1 = new Color((int)(Math.random()*255+1),(int)(Math.random()*255+1),(int)(Math.random()*255+1));
mPac p = new mPac(10,300,200, Color.red, Color.blue);
p.draw(g);
//             }
            
            
    }
    
}
