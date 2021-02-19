
/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card implements Comparable<Card>
{
    private int rank;
    private int suit;
    public Card(int suit, int rank)
    {
        this.rank=rank;
        this.suit=suit;
    }
    public String toString()
    {
        String[] a = {"clubs", "diamonds", "hearts", "spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return(ranks[rank-1] + " of " + a[suit-1]);
    }
    public int getR(){return rank;}
    public int getS(){return suit;}
    public int compareTo(Card a)
    {
        //returns 1 if class running is greater
        //-1 if input is greater
        //0 if the same
        if(suit>a.getS()){return(1);}
        else if(suit<a.getS()){return(-1);}
        else if(rank>a.getR()){return(1);}
        else if(rank<a.getR()){return(-1);}
        return(0);
    }
}
