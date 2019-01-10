
public class Banjo {

	
	public static void main(String[] args) {
		Banjo b = new Banjo();
		System.out.println(b.playsBanjo("Robert"));
	}
	
	
	String playsBanjo(String name) {
		if(name.charAt(0) == 'r' || name.charAt(0) == 'R') {
			return name + " plays banjo";
		}
		else {
			return name + " does not play banjo";
		}
	}
	
	
		
	
	
	
	
	
}
