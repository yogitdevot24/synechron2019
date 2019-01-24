class Calc {

	public int add(int i, int j) {
		return i + j;
	}
	public int mult(int i, int j) {
		return i * j;
	}
	public int div(int i, int j) {
		return i / j;
	}
	public int sub(int i, int j) {
		return i - j;
	}
	
}

public class Lab2Old {
	public static void main(String[] args) {
		Calc c = new Calc();
		System.out.println("Addition of 10,10 is = " + c.add(10, 10));
		System.out.println("Subtraction of 10,10 is = " + c.sub(10, 10));
		System.out.println("Multiplication of 10,10 is = " + c.mult(10, 10));
		System.out.println("Division  of 10,10 is = " + c.div(10, 10));
	}
	
}
