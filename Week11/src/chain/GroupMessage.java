package chain;

public class GroupMessage extends GenericMessageHandler 
{
	@Override
	public void processMessage(Message message)
	{
		if(!message.destination.equals("@everyone"))
		{
			System.out.println
			("Group message for" + message.text);		
		}		
		  if(this.next !=null)
		  {
			this.next.processMessage(message);
		  }
		
	}
}
