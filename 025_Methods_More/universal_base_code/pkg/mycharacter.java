package pkg;
import java.util.Scanner;
import java.util.Random;


public class mycharacter {
	public String role = "";
	public static int strength = 0;
	public static int intelligence = 0;
	public static int dexterity = 0;
	public static int points = 25;
	public static boolean setAll(String st, int b, int c, int d){
		return true;
		
	}
	public static void setStrength(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many strength points do you want");
			int stP = sc.nextInt();
			if(points < stP){
				System.out.println("you don't have enough points, please choose a different value");
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
	public static void setDexterity(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many dexterity points do you want");
			int dexP = sc.nextInt();
			if(points < dexP){
				System.out.println("you don't have enough points, please choose a different value");
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
	public static void setIntelligence(){
		while(true){
			Scanner sc = new Scanner(System.in);
			System.out.println("How many intelligence points do you want");
			int intP = sc.nextInt();
			if(points < intP){
				System.out.println("you don't have enough points, please choose a different value");
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
		return;
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
