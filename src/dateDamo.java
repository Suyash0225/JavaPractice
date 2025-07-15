import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDamo {
	
	static int suyash = 45;
	
	public static void main (String [] arg) {
		int suyash = 45;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		System.out.println(sdf.format(d));	
		
	}

}
