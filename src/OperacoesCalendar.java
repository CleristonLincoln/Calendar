import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class OperacoesCalendar {

	public static void main(String[] args) {
		
		
		DateFormat formatter = DateFormat.getInstance();
		System.out.println(formatter);
		formatter = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, new Locale("PT", "br"));
		System.out.println(formatter);
		
		Calendar calendario = Calendar.getInstance();
		
		System.out.println("Dia do ano: " +calendario.get(Calendar.YEAR));
		calendario.add(Calendar.YEAR, 2);
        System.out.println(	formatter.format(calendario.getTime()));
	
	
	}
	
	
}
