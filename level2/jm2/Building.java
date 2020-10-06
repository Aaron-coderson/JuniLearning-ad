
/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Building
{
    // instance variables - name, age, grade, gender
    private String location;
    private int tallFt;
    private int tallStories;
    private int sqFt;
    private int yearB;
    private int oldY;

    /**
     * Constructor for objects of class person
     */
    public Building(String location, int tallFt, int tallStories, int sqFt, int yearB, int oldY)
    {
        this.location = location;
        this.tallFt = tallFt;
        this.tallStories = tallStories;
        this.sqFt = sqFt;
        this.yearB = yearB;
        this.oldY = oldY;
    }
    public Building(String location, int yearB, int oldY)
    {
        this.location = location;
        
        this.tallStories = tallStories;
        this.sqFt = sqFt;
        this.yearB = yearB;
        this.oldY = oldY;
    }
    public Building(String location, int tallFt, int tallStories, int sqFt)
    {
        this.location = location;
        this.tallFt = tallFt;
        this.tallStories = tallStories;
        this.sqFt = sqFt;
    }
    /*
    public Building(String location,int tallStories, int sqFt)
    {
        this.location = location;
        
        this.tallStories = tallStories;
        this.sqFt = sqFt;
    }
    */
    
    public String toString(){return("Location: " + location + "; tallFt: " + tallFt + "; Stories tall: " + tallStories + "; Square ft: " + sqFt + "; Year Built: " + yearB + "; Year Old: " + oldY);}
    public void addStories(int num, int eachFt, int sq)
    {
        tallFt += eachFt*num;
        tallStories += num;
        sqFt += sq*num;
    }
    public void setOld(int yearNow){oldY = yearNow-yearB;}
    
    public String Glocation(){return location;}
    public int GtallFt(){return tallFt;}
    public int GtallStories(){return tallStories;}
    public int GsqFt(){return sqFt;}
    public int GyearB(){return yearB;}
    public int GoldY(){return oldY;}
}
