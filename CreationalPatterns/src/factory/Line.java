package factory;

public class Line extends ShapeAbstract
{

	public Line(int passedDistance)
	{
		super(passedDistance);
	}

	@Override
	public void theShapeMethod() 
	{
		System.out.println("-----");		
	}
	
	
	
}
