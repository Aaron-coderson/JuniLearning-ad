
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrPrac
{
    public static void main(String[] args) {
        // Create and print an array containing the first 10 perfect squares.
        int[] cow = new int[10];
        for(int i = 0; i<10; i++)
        {
            cow[i] = i*i;
        }
        for(int i = 0; i<10; i++)
        {
            System.out.println(cow[i]);
        }

        double[] rand = rand(10);
        for(double d : rand) // for-each loop
        {
            System.out.println(d);
        }
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] rev = rev(original);
        for(int jf : rev) // for-each loop
        {
            System.out.println(jf);
        }
    }
    // Write a method that takes in an array of integers
    //         and returns true if the first and last elements in the array are the same, 
    // otherwise return false.
    public static boolean firstLast(int[] a)
    {
        return(a[0]==a[a.length-1]);
    }
    //Write a method that takes in an array of integers and returns the sum of the integers in the array.
    public static int sum(int[] b)
    {
        int n  = 0;
        for(int i = 0; i<b.length; i++)
        {
            n += b[i];
        }
        return(n);
    }
    // Write a method that takes in an array of strings and returns the total number of letters of all the strings.
    public static int sum_let(String[] b)
    {
        int n  = 0;
        for(int i = 0; i<b.length; i++)
        {
            n += b[i].length();
        }
        return (n);
    }
    // Write a method that takes in an integer N
    //and returns an array with N random doubles between 0 and 10.
    public static double[] rand(int N)
    {
        double[] meatloaf = new double[N];
        for(int  i = 0; i<N;  i++)
        {
            meatloaf[i] = Math.random()*10;
        }
        return(meatloaf);
    }
    // Write a method that takes in an array of integers and returns the array reversed.
    public static int[] rev(int[] k)
    {
        int[] x = new int[k.length];
        int contwr =0;
        for(int i = k.length-1; i>=0; i--)
        {
            x[i] = k[contwr];
            contwr++;
        }
        return x;
    }
    
    
    
    //homework
    //https://pastebin.com/7td55jRy
}