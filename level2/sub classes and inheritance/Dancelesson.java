
/**
 * Write a description of class Dancelesson here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dancelesson extends lesson
{
    private int difficulty;
    private String danceType;
    public Dancelesson(int d2, int s, int difficulty, String d)
    {
        super(d2,s,"Dance");
        this.difficulty = difficulty;
        this.danceType = d;
    }
    public int gDifficulty(){return difficulty;}
    public boolean sD(Dancelesson a){return difficulty==a.gDifficulty();}
    public boolean eT(Dancelesson a){return difficulty<a.gDifficulty();}
    public String gDT(){return danceType;}
}
