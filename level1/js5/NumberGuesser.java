//import random;
import java.util.Scanner;
class NumberGuesser {
    public static void main(String[] args) {
        /*Program a number guessing game!
         * Ask the user for a minimum and maximum possible value for the secret number.
         * Then, randomly choose a number in this range.
         * Have the user keep guessing numbers, telling them whether their number is too low or too high,
         * until they guess the random number. Once they guess, tell them how many tries it took them to guess.
         * 
           */ 
        Scanner s = new Scanner(System.in);
        System.out.print("Maximum please: ");
        int n = s.nextInt();
        int num = (int)(n*Math.random());
        
        int g = 0;
        int countwr = 0;
 
        while(true)
        {
            countwr++;
            System.out.print("Guess num: ");
            g = s.nextInt();
            if(g==num)
            {
                System.out.println("You got the number correct on your " + countwr + " try.");
                break;
            }
            else if(g>num)
            {
                System.out.println("too high");
            }
            else if(g<num)
            {
                System.out.println("too low");
            }
        }
}
}