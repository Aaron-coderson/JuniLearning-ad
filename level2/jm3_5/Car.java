
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car implements Comparable<Car>
{
    // instance variables - replace the example below with your own
    static private int totalC;
    private String type;
    private int miles;
    private String color;
    

    /**
     * Constructor for objects of class Car
     */
    public Car(String type, int miles, String color)
    {
        this.type = type;
        this.miles = miles;
        this.color = color;
        totalC++;
    }
    public Car(String type, String color)
    {
        this.type = type;
        this.color = color;
        totalC++;
    }
    public String gType(){return type;}
    public int gMiles(){return miles;}
    public String gColor(){return color;}
    public static int gTotalC(){return totalC;}
    public String toString(){return("A " + color + " " + type + " with " + miles + " miles");}
    public void drive(int milesD){miles += milesD;}
    public boolean sMile(Car a){return((a.gMiles())==miles);}
    public int compareTo(Car other)
    {
        //miles
        //1: class greater
        //-1: input greater
        //0:same
        if(miles>(other.gMiles())){return 1;}
        else if(miles<(other.gMiles())){return -1;}
        return 0;
    }
}
