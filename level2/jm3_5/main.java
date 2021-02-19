import java.util.*;
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String[] args){
        /**
         * 
         */
        Car a = new Car("Monster Van", 2978, "blue");
        Car b = new Car("Mini Van", "yellow");
        System.out.println(a.gType());
        System.out.println(a.gColor());
        System.out.println(a);
        b.drive(1000);
        System.out.println(b);
        System.out.println(a.sMile(b));
        System.out.println(Car.gTotalC());
        Car c = new Car("Toy Car", 4, "green");
        
        Car[] cars = {a,b,c};
        Arrays.sort(cars);
        for(int i = 0; i<3; i++){System.out.println(cars[i]);}
        
    }
}