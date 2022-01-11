import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("Please give name");
		Scanner sc = new  Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("type a number");
		Scanner scb = new  Scanner(System.in);
		int b = scb.nextInt();
		int c = 0;
		while(c < b)
		{
			System.out.print(a);
			c = c + 1;
		}


		
	}
}
