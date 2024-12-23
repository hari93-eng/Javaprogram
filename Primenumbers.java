package javaprograms;

public class Primenumbers {
	public static void main(String[] args) {
	int num = 12;
	if(num<=1) 
	{
		System.out.println("the given number is not prime");
	}
	else if(num == 2|| num == 3||num ==5|| num == 7) {
		System.out.println("the given number is prime");
	}
	else if(num%2 == 0) {
		System.out.println("the given number is not prime");
	}
	else if(num%3 == 0) {
		System.out.println("the given number is not prime");
	}
	else if(num%7 == 0) {
		System.out.println("the given number is not prime");
	}
	else if(num%2 == 0) {
		System.out.println("the given number is not prime");
	}
	else 
	{
		System.out.println("the given number is prime");
	}
}
}
