//import random;
import java.util.Scanner;
class numLetterRand {
    public static void main(String[] args) {
        //v = random.randint(0,10)
        //         double x = Math.random(); // gives you double between 0 (inclusive) and 1 (exclusive)
        //         int y = (int)(10*Math.random()); // gives you integer between 0 (inclusive) and 10 (exclusive)
        //         int z = (int)(10*Math.random()+5);
        //         System.out.println(x);
        //         System.out.println(y);
        //         System.out.println(z);
        //         
        //         //print 10 random ints between 0(inclusive)-20(exclusive)
        //         System.out.println();
        //         System.out.println();
        //         System.out.println();
        //         System.out.println();
        //         
        //         for(int i = 1; i<=10; i++)
        //         {
        //             System.out.println((int)(20*Math.random()));
        //         }
        // ASCII - language where every possible character is represented by a number
        int beforeAscii = (int)(26*Math.random()+97);
        char afterAscii = (char)(beforeAscii);
        System.out.println(beforeAscii + "  " + afterAscii);
    }
}
