package modulo_data;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TesteDatas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DateFormat df;

	    df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.ENGLISH);
	    Date dataAtuaLL = new Date();
		System.out.println("EUA: " + df.format(dataAtuaLL));
		
		
		System.out.println(dataAtuaLL);
		

	}

}
