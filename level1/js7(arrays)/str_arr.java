
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class str_arr
{
    public static char[] str_arr(String a) {

        char[] finals = new char[a.length()];
        for(int i = 0; i<a.length(); i++)
        {
            finals[i] = a.charAt(i);
        }
        return finals;
        }
    }


