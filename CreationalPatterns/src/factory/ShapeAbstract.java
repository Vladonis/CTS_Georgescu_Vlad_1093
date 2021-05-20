package factory;

public abstract class ShapeAbstract 
{
	int distanceInCentimeters;
	
	
	public ShapeAbstract(int passedDistance)
	{
		distanceInCentimeters = passedDistance;
	}
	
	
	public abstract void theShapeMethod();
	
	

}
