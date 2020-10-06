
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Dog fido = new Dog("fido", 5, 50, true);
        System.out.println(fido.getAge());
        fido.setAge(6);
        System.out.println(fido.getAge());
        System.out.println(fido);
        // does the same thing as System.out.println(fido.toString());
        
 
    }
}
