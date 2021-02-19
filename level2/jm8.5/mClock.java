// A Roman clock is similar to a regular HourClock, except that a Roman clock always has 12 hours and uses special Roman numerals to represent the hour instead of the numbers from 1-12

public class mClock extends HourClock{
  // an array of the Roman numerals from 1-12
  int m = 0;
  public mClock()
  {
      
      super(false);
      
}
    public void ticki() {
    if(m==60)
    {
      tick();
}
    else
    {
        m++;
    }
  }
  public void displayTime() {
    System.out.println("Time: " + getHour() +":"+ m);
  }


}
