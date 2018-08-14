import java.util.HashSet;
import java.util.HashMap;
public class Words{
	public static void main(String[] args){
		String txt = "eu tenho um barco vermelho e um carro vermelho";
        	String inputLine = txt.trim().toLowerCase();
		System.out.println(inputLine);
        	String[] wordArray = inputLine.split(" ");  // split at spaces
		System.out.println("-------------");
		HashMap<String,Integer> hash = new HashMap<String, Integer>();
		for(String word : wordArray) {
			if(hash.containsKey(word)){
				hash.put(word, hash.get(word)+1);
			} else {
				hash.put(word, 1);
			}
		}
		System.out.println(hash);
	}
}
