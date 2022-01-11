import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		System.out.println("enter a phrase or scentence: ");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int[]arrayy = new int[a.length()];
		int count = 0;
		int x = 1;
		boolean maybe = true;
		while(true){
			for(int counta = 0; counta < a.length(); counta = counta+1){
				maybe = true;
				if(arrayy[counta] == a.indexOf(" ", count)){
					maybe = false;
					break;
				}
			}
			if(maybe == true){
				arrayy[x] = a.indexOf(" ", count);
				x = x+1;
			}
			count = count+1;
			if(count > a.length()){
				break;
			}
		}
		x = x-1;
		arrayy[0] = 0;
		System.out.println(a.substring(arrayy[x-1]));
		for(int countr = x-1; countr > 1; countr = countr-1){
			System.out.println(a.substring(arrayy[countr-1], arrayy[countr]));
		}
		System.out.println(arrayy[0]);
		System.out.println(a.substring(0, arrayy[1]));

		
	}
}
