package chain;

public class PrivateMessage extends GenericMessageHandler 
{
	

	public void processMessage(Message message) 
	{
		if(!message.destination.equals("@everyone"))
		{
			System.out.println
			("Private message for" + message.destination + message.text);		
		}
		else
		{
		  if(this.next !=null)
		  {
			this.next.processMessage(message);
		  }
		}
	}

}
