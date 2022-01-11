import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[]jimmy;
		jimmy = new int[21];
		int max = 0;
		int min = 1000;
		int total = 0;
		int average = 0;
		for(int a = 0; a < 20; a = a+1){
			int b = 0;
			Random rand = new Random();
			int c = rand.nextInt(1000);
			jimmy[b] = c;
			System.out.print(jimmy[b]);
			if(c > max){
				max = c;
			}
			if(c < min){
				min = c;
			}
			total = total + c;
			average = total/(b+1);
			b = b+1;
		}
		System.out.println("max is " + max);
		System.out.println("min is " + min);
		System.out.println("totatl is " + total);
		System.out.println("average is " + average);

		
	}
}
