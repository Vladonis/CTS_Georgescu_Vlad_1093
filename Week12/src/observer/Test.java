package observer;

public class Test {

	public static void main(String[] args) 
	{
		ServerConnectionModule connection1 = new ServerConnectionModule();
		
		BackupModule backup1 = new BackupModule();
		ConnectionStatusInterface notification1 = new UserNotificationModule();
		
		
		connection1.detectConnectionStatusChange(ConnectionStatus.UP);
		
		connection1.register(notification1);
	

	}

}
