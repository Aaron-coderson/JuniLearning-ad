
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class isLucky
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        int[] nums = new int[10];
        for(int i = 0; i<10; i++)
        {
            nums[i] = (int)((Math.random()*100)+1);
        }
        System.out.println(nums[0]);
        System.out.print("Choose a number. We will tell you if it is lucky ");
        int k = s.nextInt();
        System.out.println(isLucky(nums,k));
        
    }
    public static boolean isLucky(int[] a, int b) {
        for(int bb:a)
        {
            if(bb==b)
            {
                return true;
            }
        }
        return false;
    }
}