package Java.Tutorial.Introduction.JavaDateTime;

/**
 * Created by rgimenez on 26/12/2016.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();
        Calendar fecha = new GregorianCalendar(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));
        //fecha.getDisplayName(fecha.DAY_OF_WEEK, fecha.LONG, Locale.US);
        //String dias[]={"", "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY","SUNDAY"};
        System.out.println(fecha.getDisplayName(fecha.DAY_OF_WEEK, fecha.LONG, Locale.US).toUpperCase());
        //System.out.println(dias[fecha.DAY_OF_WEEK]);
    }
}
