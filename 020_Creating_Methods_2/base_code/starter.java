import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void pow(int a, int b)
	{
		int x = a;
		int y = b;
		int power = 1;
		for(int i = 1;i<=y;i++)
		{
			power = power*x;
		}
		System.out.println(power);
		return;
	}
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int a = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter another number");
		int b = sc2.nextInt();
		System.out.println("the answer is: ");
		pow(a,b);
	

		
	}
}
