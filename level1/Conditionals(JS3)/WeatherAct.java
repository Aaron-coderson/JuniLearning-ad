
/**
 * Write a description of class Main here.
 * Weather Activities (JS3 Conditionals):
 * Write a program that asks the user what the weather is today.
 * Based on their answer, print out an activity to do given the weather.
 * For example, if the user says “sunny” then the program might print “Go to the beach!”
 * If the user types in a weather condition the program does not know about,
 * make sure to print something out as well.
 * @author (Aaron) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

class WeatherAct {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the weather. You may enter : 'sunny' 'cloudy' 'raining' ");
        String a = "sunny";
        String b = "cloudy";
        String c = "raining";
        String x = scan.next();
        if(x.equals(a)){
            System.out.println("Go to the Beach");
        }
        else if(x.equals(b)){
            System.out.println("Go on a hike");
        }
        else if(x.equals(c)){
            System.out.println("Stay at home and play boardgames");
        }
        else
        {
            System.out.println("Don't Know?");
        }
    }
}