
/**
 * Write a description of class methods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arrays
{
    public static void main(String[] args){
        // What's an array?
        
        // Create an empty integer array of length 10.
        int[] a = new int[10];
        
        // Create an array that's pre-filled with the numbers 1, 3, 5, 7
        
        int[] b = {1,3,5,7};
        
        // Print out the second element in a and the second element in b
        System.out.println(a[1]);
        System.out.println(b[1]);
        
        // Using a loop, fill an array called nums with the numbers 1 through 20, and then print that array
        int[] c = new int[20];
        for(int i = 1; i<=20; i++)
        {
            c[i-1] = i;
        }
        for(int i = 0; i<20; i++)
        {
            System.out.println(c[i]);
        }
        
        // Using another loop, add 100 to every element of the array you just created, and print out the array
        for(int i = 1; i<=20; i++)
        {
            c[i-1] = c[i-1]+100;
        }
        for(int i = 0; i<20; i++)
        {
            System.out.println(c[i]);
        }
        //https://pastebin.com/6XCwLKPn
        //https://pastebin.com/6XCwLKPn

    }
}