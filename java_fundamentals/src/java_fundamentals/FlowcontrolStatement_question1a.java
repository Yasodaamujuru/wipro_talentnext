package java_fundamentals;
import java.util.Scanner;
public class FlowcontrolStatement_question1a {


		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		if(n>0) {
			System.out.println("Positive");
		}else if(n<0) {
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
		}
	}

