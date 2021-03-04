package laboratory.entities;

import laboratory.exceptions.IllegalTransferException;
import laboratory.exceptions.InsufficientFunsException;

public abstract class Account 
{
	public abstract double getBalance();
	public abstract void deposit(Double amount);
	public abstract void withdraw(Double amount) throws InsufficientFunsException;
	public abstract void transfer(Account destination, Double amount) throws InsufficientFunsException, IllegalTransferException;
	
	

	

}
