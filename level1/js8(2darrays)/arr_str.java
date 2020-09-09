
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class arr_str
{
    public static String str_arr(int[][] arr) {

        String str = "";
        str = str + "[";
        for(int j = 0; j<arr.length; j++)
        {
            if(j !=0)
            {
                str = str + ",";
            }
            str = str + "[";
            
            for(int z = 0; z<arr[j].length; z++){
                if(z!= 0)
                {
                    str = str + ",";
                }
                str = str + arr[j][z];
                
            }
            str = str +"]";
        }
        str = str +"]";
        return(str);

    }
}

