public class Credit{
	private int cents;

	public Credit(){
		cents = 1000;
	}

	public Credit(int value){
		if(value>0){
			cents = value;
		} else {
			System.out.println("Credit foi chamado com um valor negativo: "+value);
		}
	}

	public int getCents(){
		return cents;
	}

	public void setCents(int  value){
		if(value>=0){
			cents = value;
		} else {
			System.out.println("setCents foi chamado com um valor negativo: "+value);
		}
	}

	public void topUp(int value){
		if(value>=0){
			cents += value;
		} else {
			System.out.println("topUp foi chamado com um valor negativo: "+value);
		}
	}

	public void Consumir(int value){
		if(value>=0){
			cents = cents-value;
		} else {
			System.out.println("Consumir foi chamado com um valor negativo: "+ value);
		}
	}
}
