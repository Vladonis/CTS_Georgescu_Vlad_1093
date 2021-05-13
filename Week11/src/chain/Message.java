package chain;

public class Message 
{
	String text;
	String destination;
	int priority;
	
	public Message(String text, String destination, int priority) {
		super();
		this.text = text;
		this.destination = destination;
		this.priority = priority;
	}
	
	

}
