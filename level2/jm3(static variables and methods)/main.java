
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
   public static void main(String[] args)
   {
       /*
        String[] b = {"17+98", "99*21", "85*18", "198+691","12040/113"};
        quiz a = new quiz("Bob", 92,b);
        System.out.println(a);
        
        house h1 = new house("3414 Panorama Dr, South Lake Tahoe, CA 96150", 530000,1208);
        house h2 = new house("26 Birch Ln, North Falmouth, MA 02556",530000, 1884); //price = 619000
        house h3 = new house("1209 Lakloey Dr, North Pole, AK 99705",320000, 3292);
        house[] houses = {h1,h2,h3};
        for(int i=0; i<3; i++)
        {
            System.out.println(houses[i].toString());
        }
        
        System.out.println(house.getNumOfH());
        System.out.println(h2.compareTo(h1));
        System.out.println(h3.compareTo(h3));*/
        
       Card c1 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c2 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c3 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c4 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c5 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c6 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c7 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c8 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c9 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card c10 = new Card(((int)(Math.random()*4+1)),((int)(Math.random()*13+1)));
       Card[] cards = {c1,c2,c3,c4,c5,c6,c7,c8,c9,c10};
       
       int n = 10;
       for(int i = 0; i<n-1; i++)
       {
        for(int j = 0; j<n-i-1; j++)
        {
          if((cards[j].compareTo(cards[j+1])==1))
          {
              Card temp = cards[j];
              cards[j] = cards[j+1];
              cards[j+1] = temp;
           }
        }
        }
       for(int i = 0; i<10; i++)
       {
           System.out.println(cards[i].toString());
       }
        

        
    
   }
}


