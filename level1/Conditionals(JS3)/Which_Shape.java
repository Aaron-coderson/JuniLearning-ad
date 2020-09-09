import java.awt.*;
import java.applet.Applet;
import java.util.Scanner;
/**
 * Class Which_Shape - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class Which_Shape extends Applet{
    public void paint(Graphics j) {
        /** methods
         * fillRect(int x, int y, int w, int h)
         * setColor(Color c) ex: Color.yellow
         * fillOval(int x, int y, int w, int h)
         * fillArc(int x, int y, int w, int h, int startAngle, int arcAngle)
         */
        /** Let's use conditionals to decide which shape to draw!
         * Define a string called shape that stores either "circle,"
         * "square," "pacman," or another shape of your choosing. 
         * Have the computer draw the shape that shape is set to.
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Choose from the folowing shapes: circle[1], square[2],pacman[3],smileyface[4]: ");
        int shape = s.nextInt();
        j.setColor(Color.black);
        if(shape==1){
            j.fillOval(300,300,200,200);

        }

        else if(shape==2){
            j.fillRect(300,300,200,200);
        }

        else if(shape==3){
            //pac1
            j.setColor(Color.yellow);
            j.fillOval(75,500,200,200);

            j.setColor(Color.white);
            j.fillArc(75,500,200,200,40,-90);

        }

        else if(shape==4){
            j.setColor(Color.black);//seting color
            j.fillRect(200,20,50,200);//first eye
            j.fillRect(400,20,50,200);//second eye
            j.fillArc(100,200,400,200,180,180);//mouth
        }
    }

}

