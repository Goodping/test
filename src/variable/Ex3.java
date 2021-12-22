package variable;

public class Ex3 {

	public static void main(String[] args) {

		int a1 = 999;
		
		short a2 = 100;
		
		System.out.println(a1);

		System.out.println(a2);
		
		a1 = a2;
		
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println("==========================");
		
		int b1 = 99999;
		short b2 = 100;
		
		System.out.println(b1);
		System.out.println(b2);
		
		b2 = (short)b1;
		
		
		System.out.println(b2);
		
		System.out.println("==========================");
		
		int c1 = 256;
		byte c2 = 10;
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1 = c2;
		
		System.out.println(c1);
		System.out.println(c2);
		
		int d1 = 256;
		byte d2 = 10;
		
		System.out.println(d1);
		System.out.println(d2);
		
		d2 = (byte)d1;
		
		System.out.println(d1);
		System.out.println(d2);
	}

}
