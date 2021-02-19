import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class ticTacToe extends Applet implements MouseListener
{
    String[][] grid = new String[3][3];
    String player = "x";
    boolean canPlay = true;
    int x;
    int y;
    Font cow;
    public void init()
    {

        addMouseListener(this);
    }

    public void mouseClicked (MouseEvent e)
    {

    }

    public void mouseEntered (MouseEvent e) {
        //setBackground(Color.blue);
    }

    public void mouseExited (MouseEvent e) {
        //setBackground(Color.red);
    }

    public void mousePressed (MouseEvent e) {
        if(canPlay){
            x = (e.getX())/100;
            y = (e.getY())/100;
            if((x<4)&&(y<4)&&(grid[x][y]==null))
            {
                grid[x][y] = player;
                if(player.equals("x")){player="o";}
                else{player = "x";}
            }
            repaint();
        }
    }

    public void mouseReleased (MouseEvent e) {}

    public void paint(Graphics g)
    {
        g.fillRect(0,0,300,300);
        g.setColor(Color.white);
        g.drawLine(0,100,300,100);
        g.drawLine(0,200,300,200);
        g.drawLine(100,0,100,300);
        g.drawLine(200,0,200,300);
        // fill in the Xs and Os
        Font currentFont = g.getFont();
        Font newFont = currentFont.deriveFont(currentFont.getSize() * 7F);
        g.setFont(newFont);
        cow = currentFont.deriveFont(currentFont.getSize() * 2F);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i][j] != null) {
                    g.drawString(grid[i][j], i*100 + 25, j*100 + 75);
                }
            }
        }
cow = currentFont.deriveFont(cow.getSize() * 0.5F);
g.setFont(cow);
        // check for win or tie
        g.setColor(Color.black);

        // check the rows
        for (int i = 0; i < 3; i++) {
            if(grid[i][0] == "x" && grid[i][1] == "x" && grid[i][2] == "x") {
                g.drawString("x wins!", 125, 320);
                canPlay = false;
            } else if (grid[i][0] == "o" && grid[i][1] == "o" && grid[i][2] == "o") {
                g.drawString("o wins!", 125, 320);
                canPlay = false;
            }
        }

        // check the columns
        for (int j = 0; j < 3; j++) {
            
            if(grid[0][j] == "x" && grid[1][j] == "x" && grid[2][j] == "x") {
                g.drawString("x wins!", 125, 320);
                canPlay = false;
            } else if (grid[0][j] == "o" && grid[1][j] == "o" && grid[2][j] == "o") {
                g.drawString("o wins!", 125, 320);
                canPlay = false;
            }
        }

        // check the diagonals
        if (grid[0][0] == "x" && grid[1][1] == "x" && grid[2][2] == "x"){
            g.drawString("x wins!", 125, 320);
            canPlay = false;
        } else if (grid[0][0] == "o" && grid[1][1] == "o" && grid[2][2] == "o"){
            g.drawString("o wins!", 125, 320);
            canPlay = false;
        }

        if (grid[2][0] == "x" && grid[1][1] == "x" && grid[0][2] == "x"){
            g.drawString("x wins!", 125, 320);
            canPlay = false;
        } else if (grid[2][0] == "o" && grid[1][1] == "o" && grid[0][2] == "o"){
            g.drawString("o wins!", 125, 320);
            canPlay = false;
        }

        // check for tie
        if (canPlay) {
            int numSelected = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (grid[i][j] != null) {
                        numSelected++;
                    }
                }
            }

            if (numSelected == 9) {
                g.drawString("It's a tie!", 125, 320);
                canPlay = false;
            }
        }
    }
}

