package Class_Instance;

class BankAccount5 {
	String accNumber;
	String ssNumber;
	int balance;
	
	public BankAccount5(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("°èÁÂ¹øÈ£: " + accNumber);
		System.out.println("ÁÖ¹Î¹øÈ£: " + ssNumber);
		System.out.println("ÀÜ¾×: " + balance + '\n');
		return balance;
	}
}

public class BankAccountConstructor {
	
	public static void main(String[] args) {
		BankAccount5 yoon = new BankAccount5("12-34-56", "990990-9090990", 10000);
		BankAccount5 park = new BankAccount5("33-55-09", "770088-5959007", 10000);
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
