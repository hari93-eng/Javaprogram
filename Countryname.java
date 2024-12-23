package javaprograms;

public class Countryname {
	public static void main(String[] args) {
	
		System.out.println("india");
		 String userCountry = "india";
		System.out.println("31");
		int userage = 31;
       if(userCountry.equalsIgnoreCase("India") ) 
		{
			if(userage >= 18) 
			{
				System.out.println("you are eligible to vote");
			}
			else 
			{
				System.out.println("your age is under 18 , so are not eligible to vote");
			}
			
		}
		else
		{
			System.out.println("you are not from India, so eligible to vote");
		}
	}

}	