import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CalendarText {

	public static void main(String[] args) {

		Date now = new Date();

		System.out.println(now);

		// Data e hora
		DateFormat dateFormate = DateFormat.getInstance();
		String dS = dateFormate.format(now);
		System.out.println(dS);
		System.out.println(dateFormate.format(now));

		// apenas a hora:minuto:segundo
		dateFormate = DateFormat.getTimeInstance();
		System.out.println(dateFormate.format(now));
		
		
		dateFormate = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, new Locale("PT","br"));
		System.out.println(dateFormate.format(now));
		
		
		SimpleDateFormat sFormat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(sFormat.format(now));
		
	}
}
