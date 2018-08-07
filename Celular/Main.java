public class Main{
	public static void main(String[] args){
		Credit cr;
		cr = new Credit(10);
		System.out.println(cr.getCents());
		cr.Consumir(-5);
		System.out.println(cr.getCents());
	}
}
