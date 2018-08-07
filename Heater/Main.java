public class Main{
	public static void main(String[] args){
		Heater Hot;
		Hot = new Heater(0, 35);
		System.out.println("Temperatura: " + Hot.getTemperature());
		Hot.warmer();		
		System.out.println("Temperatura: " + Hot.getTemperature());
		Hot.cooler();		
		System.out.println("Temperatura: " + Hot.getTemperature());
	}
}
