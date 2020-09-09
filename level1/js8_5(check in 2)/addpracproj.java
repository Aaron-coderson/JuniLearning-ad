
/**
 * Write a description of class addpracproj here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class addpracproj
{
    // instance variables - replace the example below with your own
    public static void main(String args[])
    {
        int[] a = new int[10];
        for(int i = 0; i<10; i++)
        {
            a[i] = (int)(Math.random()*11);
            System.out.print(a[i]);
            System.out.print(',');
        }
        System.out.println();
        System.out.println(elementsAboveFive(a));
    }
    public static int elementsAboveFive(int[] a)
    {
        int b = 0;
        for(int i = 0; i<10; i++){
            if(a[i]>5)
            
            {
                b++;
            }
        }
        return b;
    }
}
