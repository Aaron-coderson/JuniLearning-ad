import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Get the coordinate from the user

        Scanner in = new Scanner(System.in);
        System.out.print("Please input a number from 0 to 9: ");
        int row = in.nextInt();
        System.out.print("Enter another number from 0 to 9: ");
        int col = in.nextInt();

        
        //     Write code to finish the class! (you can do this in BlueJ)
        // The code provided currently makes a scanner and asks the user to input two numbers between 0 and 9. The first number is a row, and the second number is a column. You should print out a grid where there are O’s filling the rows and columns specified by the user’s input, but an X at the entered coordinate.
        //  
        // For example, if the user entered 7 and 2, the output should look like this:
        // --O-------
        // --O-------
        // --O-------
        // --O-------
        // --O-------
        // --O-------
        // --O-------
        // OOXOOOOOOO
        // --O-------
        // --O-------
        //  
        // There are Os in row 7 and column 2, an X at the grid space (7, 2), and - everywhere else.
        // You will need to check multiple conditions to determine which symbol to print. This can be accomplished by using && and ||, or by using nested conditional statements.
        //
        
        for(int i = 0; i<=(9); i++)
        {
            for(int y = 0; y<=(9); y++)
            {
                if((i==row)&&(y==col))
                {
                    System.out.print("X");
                }
                else if((i==row)||(y==col))
                {
                    System.out.print("O");
                }
                else
                {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
 
    }
}