import java.util.Scanner;
import java.util.Random;
class starter {
	
	public static void theMethod(int a, int b){
		int c = a*b;
		if(c%3 == 0){
			System.out.println("tis divisible by 3");
		}
		else{
			System.out.println("tis not divisible by 3");
		}
	}

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int Ken = sc.nextInt();
		System.out.println("enter another number");
		Scanner sc2 = new Scanner(System.in);
		int Jeong = sc2.nextInt();
		theMethod(Ken, Jeong);
	
		
	
	}
}
