package state;

public class DeliveredState2 implements PackageInterface
{
	@Override
	public void next(Package pkg) 
	{
       pkg.setState(new ReceivedState3());
	}

	@Override
	public void prev(Package pkg) 
	{
        pkg.setState(new OrderedState1());
	}

	@Override
	public void printStatus() 
	{
        System.out.println("Package delivered to post office, not received yet.");			
	}
	

}
