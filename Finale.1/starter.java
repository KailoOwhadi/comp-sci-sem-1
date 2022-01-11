import pkg.*;
import java.util.Scanner;
import java.util.Random;
public class Hangman{
	private String guessingWord;	//The word trying to be guessed
	private int numTries;			//How many tries the user has
	
	//Empty Constructor
	public Hangman(){
		guessingWord = generateWord();
		numTries = 5; 
	}
	//Integer Constructor
	public Hangman(int a){
		guessingword = generateWord();
		numTries = a;
	}
	// GIVEN - meaning you can use this, assume it works.
	// @return nothing
	// This method sets your guessingWord to a pre generated lowercase word.
	// This method  is the same as indexOf so no using indexOf.
	public void generateWord(){
		/* implementation not shown */
	}
	
	/** Returns the index of the FIRST same letter in the guessedWord
	 *  @param letter a letter guessed by the user
	 *  @param start, the starting of index of where in the word to start checking
	 *		Preconditions: Assume letter is one single character and lowercase.
	 *	 			Assume start >= 0
	 *  @return index of first same occurrence of letter, returns -1 if no occurrence found.
	 */
	public int guessCheck(String letter, int start){
		boolean maybe = false;
		int counter = 0; 
		for(int x = 0; x < guessingword.length(); x = x+1){
			if(guessingword.substring(x+start, x+1).equals(letter)){
				maybe = true;
				int index = guessingword.indexOf(letter);
				System.out.println(index);
				return index; 
			}
		}
		if(maybe == false){
			System.out.println("-1");
			return -1;
		}
	}
	
	/** Returns true if all booleans in the array are true, false otherwise.
	 *  The purpose of this is to check if all letters have been guessed.
	 *	@param boolean array will have true or false values of guessed letters.
	 *		Precondition: arr.length > 0
	 *  @return true if all values are true, false if one or more are false.
	 */
	public boolean checkWin(boolean [] arr){
		boolean bool = true;
		for(int x = 0; x < arr.length; x = x+1){
			if(arr[x] == false){
				bool = false;
			}
		}
		if(bool == true){
			return true;
		}
		else{
			return false;
		}
	}
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Hangman x = new Hangman();     // This hangman has 5 tries and generates the word “potato”
		Hangman y = new Hangman(3);   // This hangman has 3 tries and generates the word “tomato”
		int indexO = x.guessCheck(“o”, 0);   	// This returns the value 1.
		int indexO2 = x.guessCheck(“o”, 2);	// This returns the value 5.
		int indexZ = y.guessCheck(“z”, 0);    	// This returns the value -1.
		boolean [ ] arr = {true, true, true, true, false, true};
		boolean win = x.checkWin(arr);	// win is false in this case.	
		boolean [ ] arr2 = {true, true, true, true, true, true};
		boolean win2 = x.checkWin(arr2); 	// win2 is true in this case.

	}
}
