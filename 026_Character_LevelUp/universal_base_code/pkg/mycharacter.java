package pkg;
import java.util.Scanner;
import java.util.Random;


public class mycharacter {
	String role = "";
	static int strength = 0;
	static int intelligence = 0;
	static int dexterity = 0;
	static int charisma = 0;
	static int constitution = 0;
	static int points = 0;
	static int level = 0;
	static int extrap = level*10-10;
	public static void levelUp(){
		level = level + 1;
		if(level < 2){
			points = points+25;
			System.out.println("Congrats, you are now level 1 and have 25 points to spend. You must spend all your points, but cannot have more than 10 points each");
			while(points > 0){
				setStrength();
				setIntelligence();
				setDexterity();
				setCharisma();
				setConstitution();
				System.out.println("you have spent all your points");
				myToString();
			}
		}
		else{
			points = points+10;
			System.out.println("Congrats, you are now level " + level + " and have 10 more points to spend. You must spend all your points");
			while(points > 0){
				setStrength();
				setIntelligence();
				setDexterity();
				setCharisma();
				setConstitution();
				System.out.println("you have spent all your points");
				myToString();
			}
		}
			
	}
	private static void setStrength(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many strength points do you want, but not over 10");
			int stP = sc.nextInt();
			if(points < stP){
				System.out.println("you don't have enough points, please choose a different value");
			}
			else if(strength+stP+extrap > 10){
				System.out.println("You can't have more than 10 points in a category, please try again");
			}
			else if(stP < 0){
				System.out.println("You cannot have negative points, please choose a positive number");
			}
			else{
				strength = strength+stP;
				points = points-stP;
				System.out.println("You now have " + strength + " strength points");
				System.out.println("You only have " + points + "points left to spend");
				break;
			}
		}
	}
	private static void setCharisma(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many charisma points do you want, but not over 10");
			int chaP = sc.nextInt();
			if(points < chaP){
				System.out.println("you don't have enough points, please choose a different value");
			}
			else if(charisma+chaP+extrap > 10){
				System.out.println("You can't have more than 10 points in a category, please try again");
			}
			else if(chaP < 0){
				System.out.println("You cannot have negative points, please choose a positive number");
			}
			else{
				charisma = charisma+chaP;
				points = points-chaP;
				System.out.println("You now have " + chaP + " charisma points");
				System.out.println("You only have " + points + "points left to spend");
				break;
			}
		}
	}
	private static void setConstitution(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many constitution points do you want, but not over 10");
			int constP = sc.nextInt();
			if(points < constP){
				System.out.println("you don't have enough points, please choose a different value");
			}
			else if(constitution+constP+extrap > 10){
				System.out.println("You can't have more than 10 points in a category, please try again");
			}
			else if(constP < 0){
				System.out.println("You cannot have negative points, please choose a positive number");
			}
			else{
				constitution = constitution+constP;
				points = points-constP;
				System.out.println("You now have " + constP + " constitution points");
				System.out.println("You only have " + points + "points left to spend");
				break;
			}
		}
	}
	private static void setDexterity(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many dexterity points do you want, but not over 10");
			int dexP = sc.nextInt();
			if(points < dexP){
				System.out.println("you don't have enough points, please choose a different value");
			}
			else if(dexterity+dexP+extrap > 10){
				System.out.println("You can't have more than 10 points in a category, please try again");
			}
			else if(dexP < 0){
				System.out.println("You cannot have negative points, please choose a positive number");
			}
			else{
				dexterity = dexterity+dexP;
				points = points-dexP;
				System.out.println("You now have " + dexterity + " dexterity points");
				System.out.println("You only have " + points + "points left to spend");
				break;
			}
		}
	}
	private static void setIntelligence(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many intelligence points do you want, but not over 10");
			int intP = sc.nextInt();
			if(points < intP){
				System.out.println("you don't have enough points, please choose a different value");
			}
			else if(intelligence+intP+extrap > 10){
				System.out.println("You can't have more than 10 points in a category, please try again");
			}
			else if(intP < 0){
				System.out.println("You cannot have negative points, please choose a positive number");
			}
			else{
				intelligence = intelligence+intP;
				points = points-intP;
				System.out.println("You now have " + " intelligence points");
				System.out.println("You only have " + points + "points left to spend");
				break;
			}
		}
	}
	public static void myToString(){
		System.out.println("strength points is: " + strength);
		System.out.println("dexterity points is: " + dexterity);
		System.out.println("intelligence points is: " + intelligence);
		System.out.println("charisma points is: " + charisma);
		System.out.println("constitution points is: " + constitution);
		return;
	}
	public static boolean setAll(String st, int b, int c, int d, int e, int f){
		return true;
		
	}
	public static void setRole(){
		int count = 0;
		while(count < 1)
		{
			Scanner sc = new  Scanner(System.in);
			System.out.println("choose: Wizard, Warrior, or Rouge");
			String a = sc.nextLine();
			if(a.equals("Wizard"))
			{
				System.out.println("Wizard");
				count = count+1;
			}
			else if(a.equals("Warrior"))
			{
				System.out.println("Warrior");
				count = count+1;
			}
			else if(a.equals("Rouge"))
			{
				System.out.println("Rouge");
				count = count+1;
			}
			else
			{
				System.out.println("your input does not match");
			}
		}
		
		return;
	}
	
	public mycharacter(){
		
		
	}
	
	
	public mycharacter(String a) {
		
		
		int count = 0;
		
		if(a.equals("Wizard"))
		{
			System.out.println("Wizard");
			role = a;
			
		}
		else if(a.equals("Warrior"))
		{
			System.out.println("Warrior");
			role = a;
			count = count++;
		}
		else if(a.equals("Rouge"))
		{
			System.out.println("Rouge");
			role = a;
			count = count++;
		}
		else
		{
			System.out.println("your input does not match");
			role = " no role";
		}
		
		
		
		
	}
}
