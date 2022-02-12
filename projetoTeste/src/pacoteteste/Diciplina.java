package pacoteteste;

import java.util.Arrays;

public class Diciplina {

	private String diciplina;
	
	// CADA DICIPLINA TERÁ 4 NOTAS
	double[] nota = new double[4] ;

	public double[] notas2;
	
	// Setters e Gatters 
	public String getDiciplina() {
		return diciplina;
	}
	public void setDiciplina(String diciplina) {
		this.diciplina = diciplina;
	}
	
	
	public double[] getNota() {
		return nota;
	}
	public void setNota(double[] nota) {
		this.nota = nota;
	}
	
	
	// MÉTODO PARA CALCULAR A MÉDIA 
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
			for (int pos = 0; pos < nota.length; pos++) {
			somaTotal += nota[pos];
			
		}
		return somaTotal / nota.length ;
	}
	
	
	
		// ToString para vizualizar Dados
		@Override
			public String toString() {
			return "Diciplina [diciplina=" + diciplina + ", nota=" + nota + "]";
	}
	
	// HashCode e Equals para comparar Objeto
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diciplina == null) ? 0 : diciplina.hashCode());
		result = prime * result + Arrays.hashCode(nota);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Diciplina other = (Diciplina) obj;
		if (diciplina == null) {
			if (other.diciplina != null)
				return false;
		} else if (!diciplina.equals(other.diciplina))
			return false;
		if (!Arrays.equals(nota, other.nota))
			return false;
		return true;
	}
	
}
