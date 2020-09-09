import java.util.Scanner;

/**
 * Write a description of class CYOAdventure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CYOAdventure
{
    
    static public void CYOAdventure()
    {
        Scanner s = new Scanner(System.in);
        int life = 3;
        System.out.println("It is 3/14/15. Time to go to the beach");
        
        System.out.print("Are you going to were sunscreen. No = 0. Yes = 1 ");
        
        int getSunBurn = s.nextInt();
        
        if(getSunBurn==0){
            System.out.println("Oh no you are going to get a sunBurn. Your lives will be decresed by 1.");
            System.out.println("You are at 2 lives now.");
            life = life-1;
            
        }
        if(getSunBurn==1){
            System.out.println("Good you remembered your sunscreen.");
            System.out.println("You are still at 3 lives.");
            
            
        }
        
        System.out.println("Good Job you made it to the second step. There will be a series of adventures you have to complete");
        System.out.println("The first challenge is surfing");
        System.out.print("Do you want a life vest. No = 0. Yes = 1 ");
        
        int haveLifeVest = s.nextInt();
        
        if(haveLifeVest==0){
            System.out.println("Okay, it's your choice.");
        }
        if(haveLifeVest==1){
            System.out.println("Good job. Safety First.");
        }
        
        System.out.println("Time to get out and surf the waves.");
        System.out.print("You start surfing the waves. You see everybody coming back to the shore. Run = 0 Continue = 1");
        int runBack = s.nextInt();
        
        
        if(runBack==0){
            System.out.println("Good Job, that was a shark you avoided");
        }
        if(runBack==1){
            System.out.println("Let's move on...");
            life = life-1;
            System.out.println("Oh no, their is a shark. You lost a life. You are at " + life +" lives.");
        }
       
        System.out.println("Awsome, you reached the second activity");
        System.out.println("This activity is diging. You get to shave of some dirt with an excavator then, you will need your shovel");
        System.out.println("The excavator has dug 7 feet deep for you.");
        System.out.print("The hole is filled with water want to juump in. No = 0 Yes = 1 ");
        int jumpIn = s.nextInt();
        if(jumpIn==0){
            System.out.println("Good job you avoided some scorpien tails which fell in the hole.");
            System.out.println("Let's move on");
        }
        if(jumpIn==1){
            System.out.println("Oh no there are scorpian tails there. Your life has dropped by one");
            life = life-1;
            System.out.println("You are at " + life + " lifes");
        }
        
        if(life!=0){
            System.out.println("Good job, you made it to the third activity");
            System.out.println("The third adventure is a race.");
            System.out.println("A math race. If you make a mistake with 2 or more lives you just loose the race. ");
            System.out.println("If you make a mistake with 1 life. You Fail");
            
            System.out.print("What are the first five digits of pi ");
            
            double anPi = s.nextDouble();
            
            if(anPi==3.1415){
                System.out.println("You Won, with " + life + " lives");
                
            }
            else{
                
                if(life>0){
                    System.out.println("You lost with " + life + " lives.");
                }
                else{
                    System.out.print("Sorry you failed. Want to try again. No = 0. Yes = 1 ");
                    int tryAgain = s.nextInt();
            
                    if(tryAgain==0){
                        System.out.println("The End");
                    }
                    if(tryAgain==1){
                        CYOAdventure();
                    }
                }
            }
            
            
        }
        else{
            System.out.print("Sorry you failed. Want to try again. No = 0. Yes = 1 ");
            int tryAgain = s.nextInt();
            
            if(tryAgain==0){
                System.out.println("The End");
            }
            if(tryAgain==1){
                CYOAdventure();
            }
        }   
        
    }
}
