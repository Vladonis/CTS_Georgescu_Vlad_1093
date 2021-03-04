package laboratory.entities;

public abstract class BankAccount extends Account
{
	protected String iban;
	protected double balance;
	
	public BankAccount(String passed_iban, double passed_balance)
	{
		iban = passed_iban;
		balance = passed_balance;		
	}
	
	@Override
	public double getBalance() 
	{		
		return this.balance;
	}
	
	
	
	

}
