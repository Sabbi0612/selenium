package firstseleniumframework;

abstract class abc2{
	abstract void bcd();
	void claasd() {
		
	}
}

public class Abc extends abc2 {
	void bcd() {
		System.out.println("running");
	}
	
	public static void main(String[] arg) {
		abc2 abc = new Abc();
	}
}
