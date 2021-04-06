package assigment.main;

import assigment.main.*;
import assigment.validation.*;


public class Account 
{
	protected double loanValue;
	protected double ratePerMonth;	
	protected int daysActive;
	
	AccountType account_Type;
	
	public static final float BROKER_FEE = 0.0125f;
	public static final int DAY_PER_YEAR = 365;
	
	public int getDaysActive() 	
	{
		return daysActive;
	}
	public double getLoadValue() 	
	{
		return loanValue;
	}
	public double ratePerMonth() 	
	{
		return ratePerMonth;
	}
	
	public void setLoan_value(double loanValue) throws InvalidValueExeption 	
	{
		if (loanValue < 0) 
		{
			throw new InvalidValueExeption("Invalid loan value");
		}
		this.loanValue = loanValue;
	}	
	public void setDaysActive(int daysActive) throws InvalidValueExeption 	
	{
		if (daysActive < 0) 
		{
			throw new InvalidValueExeption("Invalid days active value");
		}
		this.daysActive = daysActive;
	}
	public void setRatePerMonth(double ratePerMonth) throws InvalidValueExeption
	{
		if (ratePerMonth < 0) 
		{
			throw new InvalidValueExeption("Invalid days active value");
		}
		this.ratePerMonth = ratePerMonth;
	}
	
	
	public Account(double passedLoadValue, double passedRatePerMonth, AccountType passedAccount_Type) throws Exception 
	{
		if (passedLoadValue < 0) 
		{
			throw new InvalidValueExeption("Invalid loan value");
		}
		if (passedRatePerMonth < 0) 
		{
			throw new InvalidValueExeption("Inalid monthly rate value");
		}		
		loanValue = passedLoadValue;		
		ratePerMonth = passedRatePerMonth;
		account_Type = passedAccount_Type;		
	}
	
	public double getLoanValue() 
	{
		System.out.println("The loan value is " + this.loanValue);
		return loanValue;
	}
	
	public double getRatePerMonth() 
	{
		System.out.println("The rate is "+ratePerMonth);
		return this.ratePerMonth;
	}
	
	//must have method - the lead has requested it in all classes
	public double getMonthlyLoanPayment() 
	{
		return loanValue*ratePerMonth;
	}
	
	public void setLoanValue(double value) throws Exception 
	{
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
	}
	
	public String accountInfoString() 
	{
		return "Loan: "+this.loanValue+"; rate: "+this.ratePerMonth+"; days active:"+daysActive+"; Type: "+account_Type+";";
	}
		

	public static double getAccountTotalFee(Account[] 	accounts)
	{
		double totalFee = 0.0;
		for (int i = 0; i < accounts.length; i++) 
		{
			if (accounts[i].account_Type == AccountType.PREMIUM || accounts[i].account_Type == AccountType.SUPER_PREMIUM)
			{
				totalFee += calculateTotalFee(accounts[i]);
			}
		}
		return totalFee;
	}
	
	public static double calculateTotalFee(Account account) 
	{
		return addBrokerFee(account);
	}
	
	public static double addBrokerFee(Account account) 
	{
		return BROKER_FEE * loadValueWithInterest(account);
	}
	
	public static double loadValueWithInterest(Account account) 
	{
		return account.loanValue * addInterest(account);
	}
	
	public static double addInterest(Account account) 
	{
		return Math.pow(account.ratePerMonth, getInterestMinusPrincipal(account));
	}	
	
	public static double getInterestMinusPrincipal(Account account) 
	{
		return (account.daysActive / DAY_PER_YEAR) - account.loanValue;
	}
	
	
	
	
	

	
	
	
}