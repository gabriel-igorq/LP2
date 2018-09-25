
public class Quadrado extends Retangulo {
	
	private float lado;

	public Quadrado() {
		// TODO Auto-generated constructor stub
		lado = 5;
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return lado*lado;
	}

	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}

}
