package adapter2;

public class BirdAdapter implements ToyDuck
{
	// You need to implement the interface your
    // client expects to use.
	Bird adpterBird;
	
	public BirdAdapter(Bird passedBird)
    {       
		// we need reference to the object we are adapting
        adpterBird = passedBird;
    }
	
	
	@Override
	public void squeak() 
	{		
		adpterBird.makeSound();				
	}
	

}
