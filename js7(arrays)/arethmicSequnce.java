
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arethmicSequnce
{
    public static int[] arethmicSeq_generator(int a, int n, int d) {
        int[] sequence = new int[n];
        sequence[0] = a;
        int prev = a;
        int now = 0;
        for(int i = 1; i<n; i++)
        {
            now = prev+d;
            sequence[i] = now;
            prev = now;
        }
        return(sequence);
        
    }
}