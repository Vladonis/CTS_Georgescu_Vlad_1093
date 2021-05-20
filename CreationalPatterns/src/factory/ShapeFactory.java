package factory;

public class ShapeFactory 
{
	public static ShapeAbstract getAShape(ShapeEnum passedType,int passedDistanceInCentimeters)
	{
		ShapeAbstract theShape = null;
		switch (passedType) 
		{
		case LINE:
			theShape = new Line(100);
			break;
		case SQUARE:
			theShape = new Square(100);
			break;
		

		default:
			System.out.println("Something went wrong");	

		}
		return theShape;
	}
	
	
	

}
