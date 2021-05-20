package decorator;

public abstract class ShapeAbstractDecorator implements ShapeDecorator
{
	protected ShapeDecorator decoAttribute;

 public ShapeAbstractDecorator(ShapeDecorator passedDecoAttribute)
     {
	 decoAttribute = passedDecoAttribute;
	 }

	   public void drawShape(){
		   decoAttribute.drawShapeDecorator();
	   }	

	
	
	
}
