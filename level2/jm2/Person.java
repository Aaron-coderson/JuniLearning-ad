
/**
 * Write a description of class person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
    // instance variables - name, age, grade, gender
    private String name;
    private int age;
    private int grade;
    private String gender;
    

    /**
     * Constructor for objects of class person
     */
    public Person(String name, int age, int grade, String gender)
    {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }
    // overloading constructors
    public Person(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    // constructor with no parameters
    public Person()
    {
        name = "____";
        gender = "____";
    }
    public int getAge(){return(age);}
    public void birthday(){age++;}
    public String toString(){return("Name is " + name + ". Age is " + age + ". Grade is " + grade + ". Gender is " + gender + ". ");}

}
