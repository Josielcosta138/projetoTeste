package modulo_data;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

import sun.security.jca.GetInstance.Instance;
import sun.util.resources.CalendarData;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException, InterruptedException {

		/* ============= Nova API de Data E Hora a Partir do Java 8   BOLETOOO  ================= */

		LocalDate dataBase = LocalDate.parse("2019-02-03");
		
		System.out.println("EMISSÃO DO SEU BOLETO! ");
		System.out.println(" ");
		for (int data = 1; data < 8; data++) {
			dataBase = dataBase.plusMonths(1);
			
			System.out.println("Boleto "+data+"° mês : " 
			+ dataBase.format(DateTimeFormatter.ofPattern("     dd-MM-yyyy")));
		}
		
		System.out.println(" ");
		System.out.println(" ");
		LocalDateTime dataEhoraAtual = LocalDateTime.now();
		System.out.println("Ativação do Boleto! : "+
		dataEhoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm.s"))); //ofPattern para formatar a Data
		System.out.println(" ");
	}
} 
