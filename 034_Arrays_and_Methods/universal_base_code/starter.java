import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public  static void toStringArray(int[]a){
		for(int count = 0; count < a.length; count = count+1){
			System.out.println(a[count]);
		}
	}
	public static int getArrayAverage(int[]a){
		int average = 0;
		int count;
		for(count = 0; count < a.length; count = count+1){
			average = average + a[count];
		}
		average = average / count;
		System.out.println(average);
		return average;
	}
	public static int getArrayMax(int[]a){
		int max = 0;
		int count;
		for(count = 0; count < a.length; count = count+1){
			if(max < a[count]){
				max = a[count];
			}
		}
		System.out.println(max);
		return max;
	}
	public static int getArrayMin(int[]a){
		int min = 1000;
		int count;
		for(count = 0; count < a.length; count = count+1){
			if(min > a[count]){
				min = a[count];
			}
		}
		System.out.println(min);
		return min;
	}
	
	
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int[]jimmy = new int[100];
		for(int count = 0; count < jimmy.length; count = count+1){
			Random rand = new Random();
			int a = rand.nextInt(100);
			jimmy[count] = a;
		}
        toStringArray(jimmy);
        getArrayAverage(jimmy);
        getArrayMax(jimmy);
        getArrayMin(jimmy);
        

		
	}
}
