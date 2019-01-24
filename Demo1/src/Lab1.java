import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab1 {
	public Lab1(){
		System.out.println("in Lab1 Constructor ..");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number ");
		scan.nextInt();
		System.out.println("in Lab1 - Main ---");
		Helper h1 = new Helper();
		for(int i = 0; i< 50000;i++)
		{
			if (i == 25000)
					System.gc();
			h1.m1();
		}
	}

}
