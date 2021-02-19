
/**
 * Write a description of class lesson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lesson implements Comparable<lesson>
{
    // instance variables - replace the example below with your own
    private int d;
    private int s;
    private String sOl;

    /**
     * Constructor for objects of class lesson
     */
    public lesson(int d, int s, String sOl)
    {
        this.d = d;
        this.s = s;
        this.sOl = sOl;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString(){return(d + ", " + s +", " + sOl);}
    public int gD(){return d;}
    public int compareTo(lesson a)
    {
        if(this.d>(a.gD())){return 1;}
        return -1;
   }
}
