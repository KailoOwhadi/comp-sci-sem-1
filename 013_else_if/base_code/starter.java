import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int rand_1 = rand.nextInt(11);
		Scanner sc = new  Scanner(System.in);
		System.out.println("type number between 1 and 10");
		int a = sc.nextInt();
		boolean blobfish = rand_1!=a;
		if(blobfish = false)
		{
			System.out.println("wow you guessed it right");
		}
		else if(a<rand_1)
		{
			System.out.println("your number is too small");
		}
		else
		{
			System.out.println("your number is too large");
		}
	}
}
