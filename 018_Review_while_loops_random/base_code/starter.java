import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		// Your code goes below here
		Random rand = new Random();
		int rand_1 = rand.nextInt(10);
		System.out.println("guess the number between 1 and 10");
		while(true)
		{
			Scanner sc = new  Scanner(System.in);
			int a = sc.nextInt();
			if(a == rand_1)
			{
				break;
			}
		}
		System.out.println("you won");

		
	}
}
