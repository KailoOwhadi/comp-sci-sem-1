import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		System.out.println("enter a word");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		for(int count = 0; count < a.length(); count = count+1){
			System.out.println(a.substring(count,count+1));
		}
		


		
	}
}
