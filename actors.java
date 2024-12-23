package javaprograms;

import java.util.Scanner;

public class actors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the hero name(vijay/ajith/rajini)");
		String name = sc.next();
		if(name.equalsIgnoreCase("vijay"))
		{
			System.out.println("1.Ghilli");
			System.out.println("2.Goat");
			System.out.println("3.Thirumala");
		}
		else if(name.equalsIgnoreCase("ajith"))
		{
			System.out.println("1.vaali");
			System.out.println("2.kandu konden kandu konden");
			System.out.println("3.amaravathi");
		}
		else if(name.equalsIgnoreCase("rajini"))
		{
			System.out.println("1.veera");
			System.out.println("2.ejaman");
			System.out.println("3.gurusisiyan");
		}
		else 
		{
			System.out.println("your given name are not in the list");
		}
	}
}
