package modulo_data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		/*----------------- Object CALENDAR -----------------*/
		
		//System.out.println(" Data e milisegundos " + date.getTime());
		//System.out.println(" Calendar e Milisegundos " + calendar.getTimeInMillis());
		//System.out.println(" Calendario dia mes " + (calendar.DAY_OF_MONTH));
		
		/*
		Calendar now = Calendar.getInstance();
	    System.out.println(now.getTime());
	    System.out.println(" Dia Noite " + calendar.get(calendar.AM_PM)); */
		
		System.out.println(" Calendar Week - DiaMÊs " + (calendar.get(calendar.DAY_OF_WEEK) -1));
		System.out.println(" Dia do mês "+date.getDay()); 
		System.out.println(" ---------------------------------------------------------------------");
		
		System.out.println(" Calendar Week - MÊs " + (calendar.get(calendar.MONTH) +1));
		System.out.println(" Mês "+(date.getMonth() + 1));
		System.out.println(" ---------------------------------------------------------------------");
		
		System.out.println(" Calendar Week - Ano " + (calendar.get(calendar.YEAR)));
		System.out.println(" Ano "+ (date.getYear() + 1900));
		System.out.println(" ---------------------------------------------------------------------");
		
		System.out.println(" Calendar Week - Horas " + (calendar.get(calendar.HOUR_OF_DAY)));
		System.out.println(" Horas "+date.getHours());
		System.out.println(" ---------------------------------------------------------------------");
		
		System.out.println(" Calendar Week - Minutos " + (calendar.get(calendar.MINUTE)));
		System.out.println(" Minutos "+date.getMinutes());
		System.out.println(" ---------------------------------------------------------------------");
		
		System.out.println(" Calendar Week - Segundos" + (calendar.get(calendar.SECOND)));
		System.out.println(" Segundos "+date.getSeconds());
		
		/*-----------------Simple Date Format-----------------*/
		
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat simpleDateFormatBanco = new SimpleDateFormat("yyyy-MM-DD hh:mm.ss");
		
		System.out.println(" Data atual em formato padrão String"+simpleDateFormat.format(date));
		System.out.println(" Data em formato para Banco " + simpleDateFormatBanco.format(date));
		
		System.out.println(" Calendar data Atual " + calendar.getInstance().getTime());  // Pega data atual e Horas e Segundos 
		
		
		//simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
		//System.out.println(" Objeto Date " + simpleDateFormat.parse("1987/10/18"));
		
		simpleDateFormat = new SimpleDateFormat("hh:mm.ss");
		System.out.println(" Objeto Date " + simpleDateFormat.parse("18:20.2")); 
		
		
		
		
		
		
		
	}

}
