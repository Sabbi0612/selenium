package firstseleniumframework;

public class Exception123 {
	
	public String test() {
		return "asdasdsa";
	}

	public static void main(String[] arg) {
		Exception123 as;
		int[] a = {1,2};
		
		try {
			System.out.println(a[2]);	
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
	}
}


// NullPointer Exception
// IndexOutOfBoundsException
// NumberFormatException
// Arithmetic Exception 
// 