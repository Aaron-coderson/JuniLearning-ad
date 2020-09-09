
/**
 * Write a description of class Main here.

 * @author (Aaron) 
 * @version (a version number or a date)
 */

import java.util.*;
class var {
    public static void main(String[] args)
    {
        int num = 20;
        double pie = 3.14;
        boolean is_hot = true;
        String word = "food";
        System.out.println(num);
        Scanner s = new Scanner(System.in);
        System.out.print("Guess the animal ");
        String a = s.nextLine();
        System.out.print("Guess the color ");
        String c = s.nextLine();
        System.out.println(a.charAt(0));
        System.out.println(c.length());
        System.out.println("Your guessed a " + c +" " + a + "."); // prints out your guess ex. animal = cow color = yellow ->> "You guessed a yellow cow."
        if(a.equals("dog"))
        {
            System.out.println("Dogs rule");
        }
        // Next, let’s tell the user whether they got the right answer of a black cat! Print “Correct answer!”
        //if the animal is a black cat, print “Almost there!” 
        //if the animal is either black or a cat, and print “Incorrect answer :( ” if the user guessed neither.
        if(a.equals("cat"))
        {
            if(c.equals("black"))
            {
                System.out.println("Answer Correct");
            }
        }
        else if(a.equals("cat") || c.equals("black"))
        {
            System.out.println("Almost there!");
        }
        else
        {
            System.out.println("Incorrect answer:(");
        }
        

    }
}