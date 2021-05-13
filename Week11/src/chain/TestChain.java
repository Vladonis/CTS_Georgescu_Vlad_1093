package chain;

import javax.naming.directory.NoSuchAttributeException;

public class TestChain 
{
	public static void main(String[] args)
	{
	GenericMessageHandler filterModule1  = new FilterModule("English");
	GenericMessageHandler privateModule1 = new PrivateMessage();
	GenericMessageHandler groupModule1   = new GroupMessage();
	
	filterModule1.setNext(privateModule1);
	privateModule1.setNext(groupModule1);
	
	GenericMessageHandler chatServer = filterModule1;
	chatServer.processMessage(new Message("Hello","@Jhon",1));
	chatServer.processMessage(new Message("Word1","@Jhon",1));
	chatServer.processMessage(new Message("Hello2","@everyone",1));
	
	}
}
