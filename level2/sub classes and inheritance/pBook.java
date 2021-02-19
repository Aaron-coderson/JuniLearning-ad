
/**
 * Write a description of class pBook here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pBook extends Book
{
    private String i;
    public pBook(String t, String a, String i, int pN)
    {
        super(t,a,pN); // super() must be the first line 
        this.i = i;
    }
    public String gI(){return i;}
    public String toString(){return("Title: " + getTitle() + "; Author: " + getAuthor() + "; Ilustrator: " + i +"; Page on: " + getPageNum());}
    public boolean cSi(pBook a){return(a.gI().equals(i));}
    public boolean cIsB(pBook a){return((a.getAuthor().equals(getAuthor()))&&
        (a.getTitle().equals(getTitle()))&&
        (a.gI().equals(i)));}
}
