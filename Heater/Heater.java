public class Heater{
	private int temperature;
	private int max;
	private int min;
	private int increment;

	public Heater(int min, int max){
		temperature = 15;
		this.min = min;
		this.max = max;
		increment = 5;
	}

	public void warmer(){
		if(temperature+increment < max){
			temperature = temperature + increment;
		}
	}

	public void cooler(){
		if(temperature-increment > min){
			temperature = temperature - increment;
		}
	}

	public int getTemperature(){
		return temperature;
	}

	public void setIncrement(int value){
		if(value > 0){
			increment = value;
		}
	}
}
