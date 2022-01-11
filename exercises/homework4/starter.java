import java.util.Scanner;
import java.util.Random;
class starter {
	

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter another number");
		int b = sc2.nextInt();
		if(a % 2 == 0)
		{
			System.out.println(a + "is even");
		}
		else
		{
			System.out.println(a + "is odd");
		}
		if(b % 2 == 0)
		{
			System.out.println(b + " is even");
		}
		else
		{
			System.out.println(b + " is odd");
		}
		if(a % 3 == 0)
		{
			System.out.println(a + " is divisible by 3");
		}
		else if(a % 4 == 0)
		{
			System.out.println(a + " is divisible by 4");
		}
		else if(a % 5 == 0)
		{
			System.out.println(a + " is divisible by 5");
		}
		else
		{
			System.out.println(a + " is not divisible by 3 4 or 5");
		}
		if(b % 3 == 0)
		{
			System.out.println(b + " is divisible by 3");
		}
		else if(b % 4 == 0)
		{
			System.out.println(b + " is divisible by 4");
		}
		else if(b % 5 == 0)
		{
			System.out.println(b + " is divisible by 5");
		}
		else
		{
			System.out.println(b + " is not divisible by 3 4 or 5");
		}
	}
}
