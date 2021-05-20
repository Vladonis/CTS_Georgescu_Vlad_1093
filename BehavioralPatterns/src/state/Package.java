package state;

public class Package 
{
	private PackageInterface state = new OrderedState1();	
	
    public PackageInterface getState() 
	{
		return state;
    }
	public void setState(PackageInterface state) 
	{
		this.state = state;
	}

	public void previousState() 
	 {
	        state.prev(this);
	 }

	 public void nextState() 
	 {
	        state.next(this);
	 }

	 public void printStatus() 
	 {
	        state.printStatus();
	 }
	
	
	

}
