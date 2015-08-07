import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;



public class DateChangeActivity
{
@SuppressWarnings({ "resource", "deprecation", "static-access" })
public static void main ( String[] args )
{


	 String timeStamp = new SimpleDateFormat("hh:mm").format(new Date());
	 System.out.println(timeStamp);
	 Scanner sc = new Scanner(System.in);
	 
	 int day, month, year;
	 System.out.println("Enter the day: ");
     day = sc.nextInt();
     System.out.println("Enter the month: ");
     month = sc.nextInt();
     System.out.println("Enter the year: ");
     year = sc.nextInt();
     
     GregorianCalendar date1 = new GregorianCalendar(year,month-1,day);
     GregorianCalendar startDate = new GregorianCalendar();
  
     Date someday = new Date(year,month-1,day);
     
     day = date1.get(Calendar.DAY_OF_MONTH); 
     month = date1.get(Calendar.MONTH);  
     year = date1.get(Calendar.YEAR);
     System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
     
     int thatday = someday.getDay();
     String w = Integer.toString(thatday);
     Random r = new Random();
     int sky = r.nextInt(4);
     String weather = Integer.toString(sky);
     
     DateActivity item= new DateActivity ();
     item.setWeather(weather);
     item.setW(w);
     
     Date startDateA = date1.getTime();
     Date endDate = startDate.getInstance().getTime();
     long startDateMS = startDateA.getTime();
     long endDateMS = endDate.getTime();
     long elapsedMS = endDateMS - startDateMS;
     long elapsedDays = elapsedMS / (24 * 60 * 60 * 1000);
;
     System.out.println(item.getThatDay()+item.getWeather()+". It was "+elapsedDays +" days ago.");
}
}

 