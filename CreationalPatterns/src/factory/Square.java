package factory;

public class Square extends ShapeAbstract
{
	
	public Square(int passedDistance)
	{
		super(passedDistance);
	}

	@Override
	public void theShapeMethod() 
	{
		System.out.println(" _\r\n"+ "|_|");
		
	}

}
