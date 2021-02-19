
/**
 * Write a description of class rectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class rectangle 
{
    // instance variables - replace the example below with your own
    private int w;
    private int h;
    private String c;

    /**
     * Constructor for objects of class rectangle
     */
    public rectangle(int w, int h, String c)
    {
        this.w = w;
        this.h = h;
        this.c = c;
        
    }
    public rectangle(int w, int h)
    {
        this.w = w;
        this.h = h;
        this.c = "undefined";
        
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int gW(){return w;}
    public int getArea(){return w*h;}
    public int getPerim(){return (w*2)+(h*2);}
    public String toString(){return("Height: " + h + "; Width: " + w + "; Color: " + c);}
}
