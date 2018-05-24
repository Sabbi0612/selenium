package firstseleniumframework;

public class UnderstandingStatic {

	public static void main(String[] args) {
		System.out.println("running ");
		System.out.println(UnderstandingStatic.sum());	
		System.out.println(UnderstandingStatic.d);
	}
	
	static int d = 17;
	
	public static int sum() {
		int c = 10 + 15 + d;
		return c;
	}
	
	static {
		System.out.println("String googldss");
	}

}
