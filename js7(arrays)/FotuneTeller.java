
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FotuneTeller
{
    public static void main(String[] args) {
        String[]fortunes = {"A dubious friend may be an enemy in camouflage.","A faithful friend is a strong defense.","A fresh start will put you on your way.","A friend asks only for your time not your money.","A golden egg of opportunity falls into your lap this month.","A good time to finish up old tasks.","A lifetime friend shall soon be made.","A lifetime of happiness lies ahead of you.","A new perspective will come with the new year.","Curiosity kills boredom. Nothing can kill curiosity."};
        System.out.println(fortunes[(int)(Math.random()*10)]);
        System.out.println("Fortune from:");
        System.out.println("https://joshmadison.com/2008/04/20/fortune-cookie-fortunes/");
    }
}