import java.util.Scanner;
import java.util.Random;


class starter {
	public static void toString(String a)
	{
		System.out.println(a);
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a scentence");
		String a = sc.nextLine();
		toString(a);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Write another scentence");
		String b = sc2.nextLine();
		toString(b);
		
		


		
	}
}
