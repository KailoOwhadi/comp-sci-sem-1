import java.util.Scanner;
import java.util.Random;
class starter {
	

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("type a number");
		int num1 = sc.nextInt();
	
		for(int count = 0; count < 5; count++){
			int next = num1+count;
			System.out.println(next);
		}
		
	
	}
}
