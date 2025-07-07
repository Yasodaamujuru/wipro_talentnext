package java_fundamentals;
import java.util.Scanner;

public class Forloop_12 {

	public class SumOfDigits {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;   
	            sum += digit;           
	            num = num / 10;         

	        System.out.println("Sum of digits: " + sum);
	        sc.close();
	    }
	}

	}

}