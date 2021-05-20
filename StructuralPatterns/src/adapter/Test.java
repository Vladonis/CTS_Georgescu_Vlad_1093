package adapter;

public class Test {

	public static void main(String[] args) 
	{
		SocketAdapter sockAdapter = new SocketAdapterVariant1();
		Electricity socketV3 = getVolts(sockAdapter,3);
		Electricity socketV12 = getVolts(sockAdapter,12);
		Electricity socketV120 = getVolts(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter="+socketV3.getVolts());
		System.out.println("v12 volts using Object Adapter="+socketV12.getVolts());
		System.out.println("v120 volts using Object Adapter="+socketV120.getVolts());
	}
	
	private static Electricity getVolts(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}

	

}
