import java.util.Scanner;
import java.util.Random;
class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		
		int[]yes = new int[20];
		for(int count = 0; count < yes.length; count = count+1){
			Random rand = new Random();
			int a = rand.nextInt(10)+1;
			yes[count] = a;
			System.out.println(yes[count]);
		}
		Random rando = new Random();
		int b = rando.nextInt(10)+1;
		int total = 0;
		System.out.println("The target number is: " + b);
		for(int counter = 0; counter < yes.length; counter = counter+1){
			if(yes[counter] == b){
				System.out.println("duplicate found at index " + counter);
				total = total+1;
			}
		}
		System.out.println("there are " + total + " duplicates");
		for(int counta = 1; counta < yes.length; counta = counta+1){
			if(yes[counta] == yes[counta-1]){
				int c = counta-1;
				System.out.println("there are consecutive numbers at indexes " + c + " and " + counta + "with the number " + yes[counta]);
			}
		}
		
	}
}
