package pkg;
import java.util.Scanner;
import java.util.Random;


public class mycharacter {
	public String role = "";
	public int strength = 1;
	public int intelligence = 4;
	public int dexterity = 15;
	
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
