
/**
 * Write a description of class d2Arr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class d2Arr
{
    public static void main(String args[])
    {
        //Create a new 5x10 two-dimensional array of integers
        int[][] a = new int[5][10];
        //Set the element in the third row and fifth column to 5.
        a[2][4] = 5;
        //Print the number of rows in your two-dimensional array.
        System.out.println(a.length);
        //Print the number of collumns in your two-dimensional array
        System.out.println(a[0].length);
        //Using loops, print out all of the elements in the two-dimensional array in a grid format
        for(int i = 0; i<a.length; i++)
        {
            for(int o = 0; o<a[i].length; o++)
            {
                System.out.print(a[i][o]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
