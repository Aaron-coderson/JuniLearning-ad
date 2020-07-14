
import java.awt.*;
import javax.swing.*;

/**
 * Class paintball - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class paintball extends JApplet
{
    
    
 public void paint(Graphics j) {
   //for loop
   //left -> right
     for(int z = 0; z<=700; z = z+100){
         j.setColor(Color.red);
         j.fillOval(z,z,100,100);
        
    }
    //right->left
    int g = 0;
    for(int k = 700; k>=0; k = k-100){
         j.setColor(Color.blue);
         j.fillOval(k,g,100,100);
         g = g +100;
        
    }
    
//     //while loop
//     //left -> roght
//     int h = 0;
//     while(h<=700){
//         j.setColor(Color.red);
//         j.fillOval(h,h,100,100);
//         h = h + 100;
//     }
//     
//     int f = 700;
//     int u = 0;
//     while(f>=0){
//         j.setColor(Color.blue);
//         j.fillOval(f,u,100,100);
//         f = f -100;
//         u = u +100;
//     }
    
    
    
 /* 
 *Use our knowledge of loops and coordinates to make a diagonal of circles on our canvas. 
 *What pattern do the x and y coordinates have to follow?
 *Now, try to make a diagonal in the opposite direction.
 *Encourage the student to try switching between for loops and while loops,
 *and to add any other creative features they would like.
 */   



}
}
