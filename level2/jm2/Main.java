
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Person b0b = new Person("B0b", 10, 5,"male");
        System.out.println(b0b);
        System.out.println("BOB HAD A BIRTHDAY");
        b0b.birthday();
        System.out.println(b0b);
        Person jane = new Person("Jane", 25, "female");
        System.out.println(jane);
        Person nothing = new Person();
        System.out.println(nothing);

        Building A = new Building("San Diego, California", 10, 1, 100000, 1954, 66);
        System.out.println(A); //toString
        A.addStories(20, 10, 500);//addStories
        System.out.println(A);
        System.out.println(A.GtallFt());
        System.out.println(A.GtallStories());
        System.out.println(A.GsqFt());
        System.out.println(A.GyearB());
        System.out.println(A.GoldY());
        
        Building B = new Building("Somewhere", 2019, 1);
        System.out.println(B);
        
        Building C = new Building("Somewhere", 100, 10, 100000);
        System.out.println(C);
        
        System.out.println("Books start here");
        Book cool1 = new Book("cool book", "Mr. Cool");
        System.out.println(cool1);
        cool1.readSome(10);
        System.out.println(cool1);
        Book cool2 = new Book("cool book 2", "Mr. Cool");
        
        System.out.println(cool1.hasSameAuthor(cool2));
        System.out.println(cool2.sameBook(cool1));
    }
}

//hW: https://pastebin.com/nCwg3p1i
