
/**
 * Write a description of class Date here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Date
{
   
   private int day;
   private int month;
   private int year;
    public Date()
    {
       day = 1;
       month = 1;
       year = 2000;
       
    }
    
    public Date(int d, int m, int y)
    {
      day = d;
      month = m;
      year = y;
    }
    
    public String toString()
    {
        String str = day+"/"+month+"/"+year;
        return str;
    }
}
