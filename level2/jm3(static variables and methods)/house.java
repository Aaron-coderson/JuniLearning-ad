
/**
 * Write a description of class house here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class house implements Comparable<house>
{
    private String address;
    private int price;
    private int SqFeet;
    private static int total; // acts as a total among all houses
    // Static variables: the value is shared among all objects of the class

    /**
     * Constructor for objects of class house
     */
    public house(String address, int price, int SqFeet)
    {
        this.address = address;
        this.price = price;
        this.SqFeet = SqFeet;
        total++;
    }
    public String toString(){return("address: " + address + "; price: " + price + "; SqFeet: " + SqFeet);}
    public int getPrice(){return(price);}
    // Static methods 
    public static int getNumOfH(){return total;}
    public int getSqFt(){return SqFeet;}
    public int compareTo(house otherH){
        // returns -1 if this is less than or comes before otherH
        // returns 1 if this is greater or comes after otherH
        // returns 0 if there's a tie
        // compare by price
        if(price>otherH.getPrice()){return 1;}
        else if(price<otherH.getPrice()){return -1;}
        else{if(SqFeet>otherH.getSqFt()){return 1;}
             else if(SqFeet<otherH.getSqFt()){return -1;}
             else{return 0;}}
    }   
}

