
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class grid
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Demensions");
        System.out.println(" x please ");
        int x = scan.nextInt();

        System.out.println(" y please ");
        int y = scan.nextInt();
        int[][] arr = new int[x][y];

        for(int j = 0; j<arr.length; j++)
        {
            for(int z = 0; z<arr[j].length; z++){
                System.out.print(arr[j][z]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println();
        while(true)
        {
            System.out.println(" y please starts at 0 ");
            x = scan.nextInt();
            if(x==-1)
            {
                break;
            }
            System.out.println(" x please starts at 0");
            y = scan.nextInt();
            if(y==-1)
            {
                break;
            }
           

            arr[x][y] = 1;
            for(int j = 0; j<arr.length; j++)
            {
                for(int z = 0; z<arr[j].length; z++){
                    System.out.print(arr[j][z]);
                    System.out.print(' ');
                }
                System.out.println();
            }

        }
        System.out.println("your final : ");
        for(int j = 0; j<arr.length; j++)
            {
                for(int z = 0; z<arr[j].length; z++){
                    System.out.print(arr[j][z]);
                    System.out.print(' ');
                }
                System.out.println();
            }
        
    }
}

