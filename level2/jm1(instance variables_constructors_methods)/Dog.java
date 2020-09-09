
/**
 * Write a description of class dog here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*
 * OBJECTS and CLASSES
 * An object is a thing that has properties. Example: Dog -> fur, name, age, weight, isAlive
 * With objects, you can have methods that change their properties. Example: setWeight(), changeAlive(), getAge()
 * A class is the way an object is implemented. Kind of like the template that all objects of a class must follow
 * Example: Dog class. Template that says all Dog objects in our program must have variables for age, name, weight, isAlive
 *                     Template also says all  objects in our program must have setWeight(), getName(), getAge()
 * Object-oriented programming: Java uses this A LOT, Python sometimes
 */
public class Dog
{
    // instance variables - replace the example below with your own
    // private instance variables: can only be accessed inside class
    // public instance variables: can be accessed anywhere in the program
    private String name;
    private int age;
    private int weight;
    private boolean isAlive;

    /**
     * Constructor for objects of class Dog
     * Sets values for every instance variable
     * If the constructor doesn't set instance variables to something, they will be set to to default values
     * Defaults: int = 0, double = 0.0, boolean = false, char = '', String = null
     */
    public Dog(String n, int a, int w, boolean ia)
    {
        // initialise instance variables
        name = n;
        age = a;
        weight = w;
        isAlive = ia;
    }
}
