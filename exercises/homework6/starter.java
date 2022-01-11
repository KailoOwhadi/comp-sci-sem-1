import java.util.Scanner;
import java.util.Random;
class starter {
	
	public static boolean checkPrime(int a){
		boolean billy = false;
		for(int count = a-1; count > 2; count = count-1){
			if(a%count == 0){
				billy = true;
				break;
			}
			else{
				billy = false;
			}
		}
		if(billy == true){
			return true;
		}
		else{
			return false;
		}
	}
	public static void printPrimes(int b){
		while(true){
			b = b-1;
			if(checkPrime(b) == false){
				System.out.println(b + " is a prime number");
			}
			if(b < 4){
				break;
			}
		}
	}

	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int KenJeong = sc.nextInt();
		printPrimes(KenJeong);
		
		
	
		
	
	}
}
