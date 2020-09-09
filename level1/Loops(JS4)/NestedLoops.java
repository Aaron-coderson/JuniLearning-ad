
/**
 * Write a description of class NestedLoops here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NestedLoops
{
    public static void loops()
    {
        //print nums 1-12

        for(int i = 1; i<13; i++)
        {
            System.out.print(i + " ");
        }  

        //print multiples of two up till 24
        System.out.println(" ");
        for(int k = 2; k<25; k += 2)
        {
            System.out.print(k + " ");
        }

        System.out.println();
        //print multiples of three up to 36
        for(int z = 3; z<37; z += 3)
        {
            System.out.print(z + " ");
        }

        //get the first 12 multiples of all numbers from 1 to 12
        System.out.println();
        for(int j = 1; j<=12; j++)
        {
            for(int k = 1; k <= 12; k++)
            {
                System.out.print(j*k + " ");
            }
            System.out.println();
        }

        /*Use nested loops to print out this pattern:
         *
         **
         ***
         ****
         *****
         */

        for(int i = 1; i<=5; i++) // gives us 5 rows
        {
            for(int h = 1; h<=i; h++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        /* Use nested loops to print out this pattern:
         *****
         ****
         ***
         **
         *
         */
        for(int i = 5; i>=1; i--)
        {
            for(int h = 1; h<=i; h++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        /* Use nested loops to print out this pattern:
         * _ _ _ _
         _ * _ _ _
         _ _ * _ _
         _ _ _ * _
         _ _ _ _ *
         
         */
        for(int i = 1; i<=5; i++)
        {
            for(int k = 1; k<=5; k++)
            {
                if(i==k){
                    System.out.print("*");
                }
                else{
                    System.out.print("_");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
