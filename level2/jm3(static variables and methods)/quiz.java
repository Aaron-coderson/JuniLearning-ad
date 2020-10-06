
/**
 * Write a description of class quiz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class quiz
{
    private String name;
    private int numScore;
    private String[] questions;
    /**part 1: 
     * 1. Create a Quiz class with private instance variables for the student's name, the numerical score,
     * and an array of 5 quiz questions.
     * 2. Create a default constructor that takes in 0 arguments.
     * 3. Create another constructor that takes in all 3 parameters.
     * 4. Create an overloaded constructor that takes in only the name and the score.
     * 5. Create a getter for the score.
     * 6. Create a getter for the letter grade (A >= 90, B = 80-89, C = 70-79, D = 60-69, F < 60).
     * 7. Create a toString method: when a Quiz object is printed, print out: "[name] received a grade of [letter_grade] on the quiz. A random question on the quiz was: ___"
     * 8. Make a Quiz object fully, including 5 quiz questions, and print it out.
     */
    // part 2: https://pastebin.com/92Z3R2nk

    /**
     * Constructor for objects of class quiz
     */  
    public quiz()
    {
        this.name = "";
        this.questions = new String[5];
    }
    public quiz(String name, int numScore, String[] questions)
    {
        this.name = name;
        this.numScore = numScore;
        this.questions = questions;
    }
    public quiz(String name, int numScore)
    {
        this.name = name;
        this.numScore = numScore;
    }
    public int getScore(){return(numScore);}
    public char getLetterGrade()
    {
        if(numScore>=90){return 'a';}
        else if(numScore>=80){return 'b';}
        else if(numScore>=70){return 'c';}
        else if(numScore>=60){return 'd';}
        return 'f';
    }
    public String toString(){return(name +  " received a grade of " + getLetterGrade() + "on the quiz. A random question on the quiz was: " + questions[(int)(Math.random()*5)]);}
}
