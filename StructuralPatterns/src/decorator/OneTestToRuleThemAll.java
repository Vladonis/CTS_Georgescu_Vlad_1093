package decorator;

public class OneTestToRuleThemAll 
{
	public static void main(String[] args) 
	{    
  //-------------------Decorator----------------
   System.out.println("//-------------------Decorator----------------  \n");
   ShapeDecorator decoTest1 = new SquareDeco();
   ShapeDecorator decoTest2 = new BoldShapeDecorator(new SquareDeco());
   decoTest1.drawShapeDecorator();
   decoTest2.drawShapeDecorator();
   
    }
	  
}
