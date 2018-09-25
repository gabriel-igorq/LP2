
public class Retangulo extends Forma {
	
	private float lado;
	private float altura;
	
	public Retangulo(){
		lado = 10;
		altura = 5;
	}
	
	public float calcularArea() {
		return lado*altura;
	}
	
	public float calcularPerimetro() {
		return 2*lado + 2*altura;
	}
	
}
