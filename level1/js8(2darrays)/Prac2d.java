
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Prac2d
{
    public static void main(String[] args) {

        //1d
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        //or
        int[] arra = new int[10];
        for(int i = 0; i<arra.length; i++)
        {
            arra[i] = 1;
        }
        //2d
        //                     0          1          2
        //int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //                  0  1  2    0  1  2    0  1  2
        int[][] arr2d = {{1, 2, 3}, 
                {4, 5, 6}, 
                {7, 8, 9}};
        int[][] otherarr2d = new int[5][5];
        for(int i = 0; i<otherarr2d.length; i++)
        {
            for(int l = 0; l<otherarr2d[i].length; l++){
                otherarr2d[i][l] =  5;
            }
        }
        //printb grid
        for(int j = 0; j<otherarr2d.length; j++)
        {
            for(int z = 0; z<otherarr2d[j].length; z++){
                System.out.print(otherarr2d[j][z]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    //Write a method that takes in a 2D array of integers and returns the sum of all of the integers in the array.
    public static int sum2d(int[][] a)
    {
        int sum = 0;
        for(int[]cow:a)
        {
            for(int milk:cow)
            {
                sum += milk;
            }
        }
        return(sum);
    }
    // Write a method that takes in a 2D array of integers and returns the minimum of all of the integers in the array.
    public static int min2d(int[][] array)
    {
        int num =array[0][0];
        for(int[]a:array)
        {
            for(int b:a)
            {
                if(b<num)
                {
                    num = b;
                }        
            }
        }
        return num;
    }
    ////Homework : https://pastebin.com/JKu4Midn
}
