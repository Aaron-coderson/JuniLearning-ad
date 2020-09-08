
/**
 * Write a description of class simpleBattleship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class simpleBattleship
{
    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        char[][] grid =  new char[10][10];// n - not touched - m - miss - h - hit
        for(int i = 0; i<10; i++)
        {
            for(int o = 0; o<10; o++)
            {
                grid[i][o] ='n';
            }
        }
        boolean[][] ships = new boolean[10][10];
        int a;
        int b;
        int c;
        for(int i = 0; i<4; i++){
            c = (int)(Math.random()*2);
            if(c==0){
                a = (int)(Math.random()*10); // 0 to 9
                b = (int)(Math.random()*8); // 0 to 7
                ships[a][b] = true;
                ships[a][b+1] = true;
                ships[a][b+2] = true;
            }
            else{
                a = (int)(Math.random()*8); // 0 to 9
                b = (int)(Math.random()*10); // 0 to 7
                ships[a][b] = true;
                ships[a+1][b] = true;
                ships[a+2][b] = true;

            }
        }  
        System.out.println("n: not touched - m: missed - h: hit");
        int score = 0;
        int numSquares = 0;
        // number of squares in ships that are true
        // while true loop or for loop. Inside loop, use scanner to ask player for row and column.
        // if the row and column in ships is true, say it's a hit. if not, say it's a miss
        // if score = numSquares, the player wins and you break the loop

        // between turns, need to print out the entire grid. smart way is to write a method that prints the grid and call it every time
        int y = 0;
        int x =0;

        //         for(int k= 0; k<10; k++)
        //         {
        //             for(int o = 0; o<10; o++)
        //             {
        //                 System.out.print(ships[k][o]);
        //                 System.out.print(" ");
        //             }
        //             System.out.println();
        //         }

        for(int turns = 30; turns>0; turns--)
        {
            numSquares = (shipSpotLeft(ships));
            System.out.println("You have " + turns + "turns left");
            System.out.println("Here is your curent board:");
            printArr(grid);
            System.out.println("You need to get " + numSquares + " more");

            System.out.print("Choose x: ");
            x = scan.nextInt();
            System.out.print("Choose y: ");
            y = scan.nextInt();
            if(ships[y][x]==true)
            {
                System.out.println("Hit");
                grid[y][x] ='h';
                score++;
                ships[y][x] = false;
            }
            else
            {
                System.out.println("Miss");
                grid[y][x] ='m';
            }
            numSquares = shipSpotLeft(ships);
            if(numSquares==0)
            {
                System.out.println("You win");
            }
            System.out.println("You have a score of: " + score);
        }
        System.out.println("You have a final score of: " + score + " out of 12");
    }

    public static int shipSpotLeft(boolean[][] grid)
    {
        int a = 0;
        for(int i = 0; i<10; i++)
        {
            for(int o = 0; o<10; o++)
            {
                if(grid[i][o] == true)
                {
                    a++;
                }
            }
        }
        return a;
    }

    public static void printArr(char[][] grid)
    {
        for(int i = 0; i<10; i++)
        {
            for(int o = 0; o<10; o++)
            {
                System.out.print(grid[i][o]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
