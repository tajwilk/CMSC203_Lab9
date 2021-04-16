
public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public SavingsAccount(SavingsAccount s, double amount) {
		super(s, amount);
		savingsNumber = s.savingsNumber+1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		super.deposit(super.getBalance() * rate/12);
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	
	
}
