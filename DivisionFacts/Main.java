
/**
 * Write a description of class Main here.
 * 
 * @author (Aaron) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

  System.out.print("Enter the Divisor ");

  int divisor = scan.nextInt();

  System.out.print("Enter the Dividend ");

  int dividend = scan.nextInt();
  if (dividend !=0){
      int q = divisor/dividend;
  
      int remainder = divisor-(dividend*q);
  
      System.out.print(divisor + " divided by " + dividend + " equals " + q + " with a remainder of " + remainder + "."); 
  
  


  }
  if (dividend ==0){
      
      System.out.println("ERROR YOU HAVE PRINTED A INCORRECT VALUE");
      




    }
}
}