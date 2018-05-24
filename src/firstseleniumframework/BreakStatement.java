package firstseleniumframework;

public class BreakStatement {

	public static void main(String[] args) {
		for(int i = 0; i <= 10; i++) {
			if (i==7) {
				System.out.println("inner if -----"+i);
				 
			}
			System.out.println("outer if ----- "+i);	
		}
		
		System.out.println("Im out of the loop.. Hence Im not looping anymore");
	}
}
