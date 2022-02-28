package pacoteteste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String text = " Josiel, Java, 80, 70, 90, 89";
		
		String[] valorArray = text.split(",");
		
		/*System.out.println(" Nome:" +valorArray[0]);
		System.out.println(" Disciplina:" +valorArray[1]);
		System.out.println(" Valor 1:" +valorArray[2]);
		System.out.println(" Valor 2:" +valorArray[3]);
		System.out.println(" Valor 3:" +valorArray[4]);*/
		
			// Convertendo array para Lista
		
		List<String> list = Arrays.asList(valorArray);
		
			for (String valores : list) {
				System.out.println(" Valor "+valores);
			}
		
		
		
		
	}
}
