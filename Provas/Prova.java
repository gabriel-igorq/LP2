public class Prova{
	private double notaParte1;
	private double notaParte2;

	public Prova(double n1, double n2){
		notaParte1 = n1;
		notaParte2 = n2;
	}

	public void setNotas(double n1, double n2){
		notaParte1 = n1;
		notaParte2  = n2;
	}

	public double calcularNotaTotal(){
		double total = notaParte1 + notaParte2; 
		return total; 
	}
}
