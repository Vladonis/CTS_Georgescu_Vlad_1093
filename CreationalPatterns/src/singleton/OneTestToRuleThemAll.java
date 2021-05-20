package singleton;
import java.lang.Math;

public class OneTestToRuleThemAll 
{
	public static void main(String[] args) 
	{
	//----------------Singleton---------------
    System.out.println("//-------------------Singleton----------------  \n");

    SingleMap object = SingleMap.getInstance();    
    object.showMessage();
    
 
	}
	  
}
