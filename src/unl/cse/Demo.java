package unl.cse;

public class Demo {
	
	public static void main(String[] args) {
		
		int a = 10;
		int b =  20;
		double y = 3.14159;
		double z = 10;
		
		
		String message = "Goodbye World";
		
		System.out.println(b);
		System.out.println(y);
		System.out.println(message);
	
		System.out.printf("b = %d, y = %f, %s\n", b, y, message);
		
		int c = a + b;
		c = a - b;
		c = a * b;
		c = a / b;
		double d = (double) a / b;
		System.out.println(c);
		System.out.println(d);

	}

}
