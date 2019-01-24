import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Lab2 {
	public static void main(String[] args) {
	
		UnaryOperator<Integer>   sqr = (no)-> no*no;
		BinaryOperator<Integer> add = (a,b) -> a+b;
		BinaryOperator<Integer> sub = (a,b) -> a-b;
		BinaryOperator<Integer> mult = (a,b) -> a*b;
		BiFunction<Integer,Integer,Double> div = (a,b)->a*1.0/b;
		
		System.out.println("Sqr of 10 is " + sqr.apply(10));
		
		sqr = (no)-> no*no*no;
		
		System.out.println("Addition of 10,10 is = " + add.apply(10, 10));
		System.out.println("Addition of 10,10 is = " + sub.apply(10, 10));
    	System.out.println("Addition of 10,10 is = " + mult.apply(10, 10));
		System.out.println("Addition of 10,0 is = " + div.apply(10, 0));
	}
	
}
