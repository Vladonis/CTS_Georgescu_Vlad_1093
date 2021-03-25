package singleton.staticversion;

public class RESTBackend 
{
	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
	
	
	static 
	{
	System.out.println("Is executed when the class is loaded");	
	theBackend = new RESTBackend();
	theBackend.url = "www.ase.acs.ro/cts";
	}
	
	private RESTBackend()
	{
		
	}

	
}
