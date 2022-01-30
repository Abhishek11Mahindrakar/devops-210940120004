package Section_4;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the number to calculate factorial  ");
		int num = scan.nextInt();
		int fact = num;
		for (int i = (num -1); i >= 1 ; i-- ) {
			fact = fact *i;
		}
		System.out.println("The factorial of "+ num + " "+"is" + " "+fact );
		scan.close();

	}

}
