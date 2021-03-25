package singleton;

public class RESTBackend 
{
	String url;
	String data;
	
	private static RESTBackend theBackend = null;
	
	private RESTBackend(String url, String data) 
	{
		System.out.println("Opening a connection to backend service");
		this.url = url;
		this.data = data;
	}
	
	private RESTBackend() 
	{
		
	}
	
	public void sendGET()
	{
		System.out.println("Send GET command to"+ this.url);
	}
	
	public static synchronized RESTBackend getRESTBackend()
	{
		if(theBackend == null)
		{
			String url= "www.acs.ase.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend(url, data);	  
		}
		
		return theBackend;
	}
	
	

}
