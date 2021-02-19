
/**
 * Write a description of class square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class square extends rectangle
{
    // subclass: inherits all methods and public instance variables from the superclass
    public square(int w, String c){
        super(w,w,c);
    }
    public square(int w){
        super(w,w);
    }
    public int getPerim(){return(gW()*4);}

}
