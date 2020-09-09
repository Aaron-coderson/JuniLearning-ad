import java.util.Scanner;
class MathStuff {
    public static void main(String[] args) {
        for(int i =1; i<=50; i++)
        {

            if(((i%3)==0)&&((i%5)==0))
            {

                System.out.println("FizzBuzz");
            }
            else if((i%3)==0)
            {

                System.out.println("Fizz");
            }
            else if((i%5)==0)
            {

                System.out.println("Buzz");
            }
            else
            {
                System.out.println(i);

            }
        }
//         System.out.println();
//         System.out.println();
// 
//         //2
//         int z = (int)(1000*Math.random());
//         System.out.println("The factors of " + z + " are:");
//         for(int k = 1; k<=z; k++)
//         {
//             if((z%k)==0)
//             {
//                 System.out.println(k);
//             }
//         }
//         System.out.println();
//         System.out.println();
//         //3
//         /*
//          * 3. Write a program that creates a String variable called "word"
//          * and prints out the word in reverse.
//          * Your program should work no matter what word "word" is set to.
//          */
//         Scanner s = new Scanner(System.in);
//         System.out.print(" word please ");
//         String word = s.nextLine();
//         int x = word.length();
//         System.out.println();
//         for(int w=0; w<x; w++)
//         {
//             System.out.print(word.charAt((x-1)-w));
//         }
    }
}