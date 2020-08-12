
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MethodsPrac
{
    public static void main(String[] args) {
        int x = sum(8, 3);
        System.out.println(x);
    }  
    public static int sum(int a, int b)
    {
        return(a+b);
    }
    public static double average(int a, int b, int c)
    {
        return (a + b + c)/3.0;
    }
    public static boolean is_even(int x)
    {
        return((x%2)==0);
    }
    public static double smallest(double a, double b, double c)
    {
        if(a < b && a < c){
            return a;
        }
        else if(b<a && b<c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static int fact(int a)
    {
        if(a==0)
        {
            return 1;
        }
        else
        {
            return(a*fact(a-1));
        }
    }
    public static int exponent(int b, int p)
    {
        int val = 1;
        for(int i = 0; i<p; i++)
        {
            val = val*b;
        }
        return(val);
    }
    public static boolean is_palindrome(String a)
    /*
     * returns true if a is a palindrome, false if it's not
     * "racecar" -> true
     * "goog" -> true
     * "yes" -> false
     * "a" -> true
     * "" -> true
     */
    {
        String rev = "";
        for(int i = a.length()-1; i>=0; i--)
        {
            rev = rev + a.charAt(i);
        }
        return(rev.equals(a));
//         for(int i = 0; i < a.length()/2; i++){
//             if(a.charAt(i) != a.charAt(a.length()-1-i)){
//                 return false;
//             }
//         }
//         return true;
    }
    public static String expand(String a, int b)
    /*
     * Write a method that takes in a string and an integer x,
     * and returns a string with each character in the string repeated x times.
     * For example, if you pass in "dog" and 3, then the method should return "dddoooggg."
     * 
     */
    {
        String finite = "";
        for(int i = 0; i<a.length(); i++)
        {
            for(int k =0; k<b; k++)
            {
                finite = finite + a.charAt(i);
            }
        }
        return finite;
        
    
    }
    /* Number Guesser
     * Program a number guessing game! Ask the user for a minimum and maximum possible value for the secret number. Then, randomly choose a number in this range. Have the user keep guessing numbers, telling them whether their number is too low or too high, until they guess the random number. Once they guess, tell them how many tries it took them to guess.
     * Second:
     * https://pastebin.com/dJ5zncw7
     */
}
