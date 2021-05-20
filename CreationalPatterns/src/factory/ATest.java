package factory;
import java.lang.Math;

public class ATest 
{
	public static void main(String[] args) 
	{
	
  //-------------------Factory----------------
    System.out.println("//-------------------Factory----------------  \n");

    ShapeAbstract line1 = new Line(175);
    ShapeAbstract square1 = new Square(200);
    square1.theShapeMethod();
    line1.theShapeMethod();

    }
	  
}
