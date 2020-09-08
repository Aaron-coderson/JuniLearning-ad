
/**
 * Write a description of class MethodsPrac here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MagicSquare
{
 
  public static boolean msquare(int[][] a)
  {
      int num = a[0][0]+a[0][1]+a[0][2];
      if(num!= a[1][0]+a[1][1]+a[1][2])
      {
          return false;
      }
      else if(num!= a[2][0]+a[2][1]+a[2][2])
      {
          return false;
      }
      else if(num!= a[0][0]+a[1][0]+a[2][0])
      {
          return false;
      }
      else if(num!= a[0][1]+a[1][1]+a[2][1])
      {
          return false;
      }
      else if(num!= a[0][2]+a[1][2]+a[2][2])
      {
          return false;
      }
      else if(num!=a[0][0]+a[1][1]+a[2][2])
      {
          return false;
      }
      else if(num!=a[0][2]+a[1][1]+a[2][0])
      {
          return false;
      }
      return true;
  }
}