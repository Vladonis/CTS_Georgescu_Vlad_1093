package laboratory.entities;

import laboratory.exceptions.IllegalTransferException;
import laboratory.exceptions.InsufficientFunsException;

public class SavingsAccount extends BankAccount
{
    public static final double MIN_BALANCE=100;
	
	public SavingsAccount(String passed_iban)
	{
		super(passed_iban, MIN_BALANCE);		
	}

	@Override
	public void deposit(Double amount)
	{		
		this.balance += amount;		
	}

	@Override
	public void withdraw(Double amount) throws InsufficientFunsException
	{
		if(amount > this.balance)
		{
			throw new InsufficientFunsException("You need more money");
		}
		
		else 
		{
			this.balance -= amount;
		}
		
	}
	
	@Override
	public void transfer(Account destination, Double amount) throws InsufficientFunsException, IllegalTransferException
	{
		if(this == destination)
		{
			throw new IllegalTransferException();
		}
		
		this.withdraw(amount);
		destination.deposit(amount);		
	}
	
	
	

}
