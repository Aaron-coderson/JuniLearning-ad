
/**
 * Write a description of class Main here.
 * Checkout Calculator (JS4 Loops):
 * Sheryl’s Shoe Shop has hired you to write a program to help them at their checkout register.
 * Your program should keep asking the user for the price of their next item, until the user enters 0.
 * At the end, print out the total of all the prices entered.
 * @author (Aaron) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

class CheckoutCalc {
    public static void main(String[] args){
        double x = 0;
        double v = 0;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            System.out.print("number please ");
            v = scan.nextDouble();
            x += v;
            if(v==0)
            {
                break;
            }
        }w
        System.out.println(x);
    }
}