package decorator;

public class BoldShapeDecorator extends ShapeAbstractDecorator {

	public BoldShapeDecorator(ShapeDecorator passedDecoAttribute) {
		super(passedDecoAttribute);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void drawShapeDecorator() 
	{
		// TODO Auto-generated method stub
		decoAttribute.drawShapeDecorator();
		setBoldBorder(decoAttribute);
	}
	
	private void setBoldBorder(ShapeDecorator passedDecoAttribute)
	{
		System.out.println("Decorator test");
	}

}
