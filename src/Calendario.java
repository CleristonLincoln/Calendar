
import java.util.Calendar;

public class Calendario {
	
	
	public static void main(String[] args) {
		
		
Calendar calendario = Calendar.getInstance();		

System.out.println("Ano: "+calendario.get(Calendar.YEAR));
System.out.println("Mês: "+calendario.get(Calendar.MONTH));
System.out.println("Dia do mês: "+calendario.get(Calendar.DAY_OF_MONTH));
System.out.println("Dia da semana: "+calendario.get(Calendar.DAY_OF_WEEK));
System.out.println("Dia do ano: "+calendario.get(Calendar.DAY_OF_YEAR));
System.out.println("Semana do ano: "+calendario.get(Calendar.WEEK_OF_YEAR));
System.out.println("Semana do mês: "+calendario.get(Calendar.WEEK_OF_MONTH));
System.out.println("Dia da semana do mês: "+calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
System.out.println("Hora: "+calendario.get(Calendar.HOUR));
System.out.println("AM ou PM: "+calendario.get(Calendar.AM_PM));
System.out.println("Hora do dia: "+calendario.get(Calendar.HOUR_OF_DAY));
System.out.println("Minuto: "+calendario.get(Calendar.MINUTE));
System.out.println("Segundo: "+calendario.get(Calendar.SECOND));
System.out.println("Milisegundos: "+calendario.get(Calendar.MILLISECOND));
	}
	

}
