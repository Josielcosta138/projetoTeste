package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import sun.util.resources.CalendarData;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		
		/*============= Faixa de tempo com ChronoUnit =================*/
		
		//Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2022");
		
		long  dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-22"), LocalDate.now());
		System.out.println("Entre a data 2021-02-22 \nPossui "+dias+" Dias de diferença até a data atual! ");
		System.out.println(" ");
		
		long  meses = ChronoUnit.MONTHS.between(LocalDate.parse("2022-02-22"), LocalDate.now());
		System.out.println("Entre o MÊs 2021-06-22 \nPossui "+meses+" Mêses de diferença até a data atual! ");
		System.out.println(" ");
		
		long  anos = ChronoUnit.YEARS.between(LocalDate.parse("1990-02-22"), LocalDate.now());
		System.out.println("Entre o Ano 1990-02-22 \nPossui "+anos+" Anos de diferença até a data atual! ");
		
		
		
	}

}
