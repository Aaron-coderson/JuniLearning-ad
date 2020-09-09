
/**
 * Write a description of class Main here.
 * 
 * @author (Aaron) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

class Main {
    /*
    public static String isprime(int num){
        
        
        if(num%2 != 0 || num ==2){
            if(num%3 != 0 || num==3){
                if(num%5 != 0 || num==5){
                    if(num%7 != 0 || num==7){
                        return("That number you inputed was prime");
                    }
            }
        }
        }
    
    return("That number you inputed was not prime");
    
    }
    */
    public static String isRelPrime(int num1, int num2){
        int greater = 0;
        int lesser =0;
        if(num1 >num2){
            greater = num1;
            lesser = num2;
        }
        if(num2>num1){
            greater = num2;
            lesser = num1;
        }
        else{
            greater = num1;
            lesser = num2;
        }
        if(greater%lesser != 0){
            return("The dividend or the divisor cannot be divided by the other one");
        }
        return("The dividend or the divisor can be divided by the other one");
        
}
  public static void main(String[] args) {
      
   
  Scanner scan = new Scanner(System.in);
  

  System.out.print("Enter the Divisor ");

  int divisor = scan.nextInt();
  
  //String divisorp = isprime(divisor);
  
  //System.out.println(divisorp);
 

  System.out.print("Enter the Dividend ");

  int dividend = scan.nextInt();
  
  //String dividendp = isprime(dividend);
  
  //System.out.println(dividendp);
  
  System.out.println(isRelPrime(divisor,dividend));
 
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