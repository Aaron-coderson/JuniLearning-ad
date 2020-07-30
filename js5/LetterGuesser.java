//import random;
import java.util.Scanner;
class LetterGuesser {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int beforeAscii = (int)(26*Math.random()+97);
        char afterAscii = (char)(beforeAscii); // computer decides on random letter
        char guess;
       int contwr = 0;
        while(true){
        contwr += 1;
        System.out.println();
        System.out.print("Guess the letter ");
        guess = s.nextLine().toLowerCase().charAt(0);
        if(guess==afterAscii)
        {
            System.out.println("You won on your " + contwr + " turn.");
            break;
        }
        else
        {
            if(guess>afterAscii){
                System.out.println("Your guess came before in the alphebet");
            }
            else if(guess<afterAscii){
                System.out.println("Your guess came after in the alphebet");
            }
        }
        
    }
}
}