
/**
 * Write a description of class Main here.
 * @author (Aaron) 
 * @version (a version number or a date)
 */
class loops {
    public static void main(String[] args)
    {
        for(int i = 0; i<10; i++)
        {
            System.out.println(i);
        }
        System.out.println();
        for(int i =20; i>=10; i--)
        {
            System.out.println(i);
        }
        // print out all the even numbers between 12 and 28
        System.out.println();
        for(int i = 12; i<=28; i+=2)
        {
            System.out.println(i);
        }
        int z = 0;
        System.out.println();
        while(z<=20)
        {
            System.out.println(z);
            z++;
        }
        

        System.out.println();
        int j =34;
        while(j>=10)
        {
            System.out.println(j);
            j -= 2;
        }
        
        for(int i = 1; i<=5; i++)
        {
            for (int v = 1; v<=5; v++)
            {
                System.out.print((v*i) + " ");
            }
            System.out.println();
        }
        
        
    }
}