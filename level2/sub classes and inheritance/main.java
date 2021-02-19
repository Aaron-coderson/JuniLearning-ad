
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays; 
//https://pastebin.com/2GtFvA94
//https://pastebin.com/2GtFvA94
public class main
{
    public static void main(String[] args){
        
        rectangle rect = new rectangle(1,2,"Amaranth");
        square squar = new square(3,"Audi Beluga Brown");
        System.out.println(rect);
        System.out.println(squar);
        
        pBook pBook1 = new pBook("I am a Book", "I am a Author", "I am a Ilustrator", 1000);
        pBook pBook2 = new pBook("I am not a Book", "I cannot Write", "I am a Ilustrator", 0);
        pBook pBook3 = new pBook("I am not a Book", "I cannot Write", "I am a Ilustrator", 1000000);
        System.out.println(pBook1.cSi(pBook2));
        
        System.out.println(pBook2.cIsB(pBook1));
        System.out.println(pBook2.cIsB(pBook3));
        
        lesson a = new lesson(120, 60, "Data Sience"); 
        lesson b = new lesson(60, 24, "Sience");
        lesson c = new lesson(140, 70, "Electrical Engineering");
        Dancelesson d = new Dancelesson(400, 40, 3, "Type");
        Dancelesson e = new Dancelesson(200, 50, 1, "Type");
        lesson[] lessons = {a,b,c, d , e};
        Arrays.sort(lessons);
        for(int i = 0; i<5; i++){System.out.println(lessons[i]);}
        System.out.println(d.sD(e));
        System.out.println(e.eT(d));
    }
}

