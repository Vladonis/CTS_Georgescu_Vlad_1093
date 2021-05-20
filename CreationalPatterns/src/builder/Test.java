package builder;

public class Test 
{
	public static void main(String[] args) 
	{		
		Computer pc1 = new Computer.ComputerBuilder(
				"500 GB", "2 GB").setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		
		Computer pc2 = new Computer.ComputerBuilder(
				"500 GB", "2 GB").build();
		
		System.out.println(pc1.diskReaderEnabled);
		System.out.println(pc2.diskReaderEnabled);

	
		
	}

	
	
	
	
}
