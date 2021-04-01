package designPatterns;

import java.util.ArrayList;
import java.util.Random;


public class Char3DModel implements Cloneable
{
	CharacterType type;
	ArrayList<Integer> graphicPoints = new ArrayList<>();		
	String colour;	
	

	public Char3DModel(CharacterType _type, String _colour) 
	{		
		type = _type;
		colour = _colour;
		
		System.out.println("Generating the 3D model points.....");
		try 
		{
			Thread.sleep(2000);
			Random random = new Random(35241); //number is the seed
			for(int i = 0; i<20;i++)
			{
				graphicPoints.add(random.nextInt(1000));
			}
			System.out.println("Model loaded.");
			
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}	
	}


	
	private Char3DModel() 
	{
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
    {		
		
		Char3DModel copy = new Char3DModel();
		copy.type = this.type;
		copy.graphicPoints = (ArrayList<Integer>)this.graphicPoints;
		copy.colour = this.colour;

		
		return copy;
	}
	

	
	

}
