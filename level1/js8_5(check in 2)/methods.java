
/**
 * Write a description of class methods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class methods
{
    public static void main(String[] args){
        // What's a method?
        
        // Using the coinFlip method you wrote, simulate flipping a coin 100 times and print out 
        //"You flipped heads __ times out of 100!"
        int cows = 0;
        for(int i = 0; i<100; i++)
        {
            String a = flip();
            if(a.equals("Heads"))
            {
                cows++;
            }
        }
        System.out.println("you flipped heads " + cows + " times out of 100");
    }
    // Define a method that takes in two integers and returns the sum of those two integers.
    public static int sum(int a, int b)
    {
        return(a+b);
    }
    // Define a method that "flips" a coin. 
    //In the method, create a random double between 0 and 1. 
    //If the double is 0.5 or above, return "Heads". 
    //If the double is less than 0.5, return "Tails".
    public static String flip()
    {
        double rand = Math.random();
        if(rand>=0.5)
        {
            return("Heads");
        }
            return("Tails");
        }
        
    }
