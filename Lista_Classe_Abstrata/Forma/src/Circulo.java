public class Circulo extends Forma {
	
	private float raio;

	public Circulo() {
		// TODO Auto-generated constructor stub
		raio = 3;
	}

	public float calcularArea(){
		return (float)Math.PI*raio*raio;
	}
	
	public float calcularPerimetro() {
		return (float) Math.PI*raio*2;
	}
	
}
