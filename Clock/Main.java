public class Main{
	public static void main(String[] args){
		ClockDisplay clock;
		clock = new ClockDisplay(13, 60, true);
		System.out.println("top");
		System.out.println(clock.getTime());
	}
}
