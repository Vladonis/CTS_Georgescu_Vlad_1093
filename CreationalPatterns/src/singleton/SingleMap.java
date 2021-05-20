package singleton;

public class SingleMap 
{

	private static SingleMap mapInstance = new SingleMap();
	
	   int dataX;
	   int dataY;

	   private SingleMap(){}
	  
	   public static SingleMap getInstance()
	   {
	      return mapInstance;
	   }

	   public void showMessage()
	   {
	      System.out.println("Map created");
	   }
	
	
	
	
}
