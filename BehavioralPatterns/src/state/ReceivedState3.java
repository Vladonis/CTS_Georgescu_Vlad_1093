package state;

public class ReceivedState3 implements PackageInterface
{

	@Override
	public void next(Package pkg) 
	{
        System.out.println("This package is already received by a client.");		
	}

	@Override
	public void prev(Package pkg)
	{
      pkg.setState(new DeliveredState2());
	}

	@Override
	public void printStatus() 
	{
        System.out.println("Package received.");			

	}
	

}
