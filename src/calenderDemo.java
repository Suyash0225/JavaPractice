import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calenderDemo {
	public static void main(String [] ards) {
		
		Calendar cl = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyy  hh:mm:ss" );
		System.out.print(sdf.format(cl.getTime()));
		
	}

}
