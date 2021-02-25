package java_week1;

public class App {

	public static void main(String[] args) {
		// week 1 programming assignment
		// create variables with appropriate data types
			
			float itemPrice = 4.99f;
			float walletMoney = 15.87f;
			float numFriends = 38f;
			float myAge = 40f;
			String firstName = "John-Jacob";
			char middleInitial = 'J';
			String lastName = "Smith";
	
		// Create a 3rd variable using the declared variable above
			
			float newWalletMoney = walletMoney - itemPrice;
			float agePerYear = numFriends/myAge;
			String fullName = firstName + " " + middleInitial + " " + lastName;
					
		//Print out lines for the new variables created with some added description to what I am printing
			
			System.out.println("After I purchased lunch I only had " + newWalletMoney + " in my wallet.");
			System.out.println("The average number of friends I have gained per year is " + agePerYear +".");
			System.out.println("My full name is " + fullName + ".");
			
	}

}
