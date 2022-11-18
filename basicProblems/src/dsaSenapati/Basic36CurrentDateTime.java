/*
 Write a Java program to display the current date time in specific format. Go to the editor
Sample Output:

Now: 2017/06/16 08:52:03.066 


 */
package dsaSenapati;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Basic36CurrentDateTime {

	public static void main(String args[]) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
		cdt.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT")));
		
		System.out.println("\nNow: "+cdt.format(System.currentTimeMillis()));
	}
}
