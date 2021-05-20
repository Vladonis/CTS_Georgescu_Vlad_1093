package adapter;

//Object adapter implementation variant
public class SocketAdapterVariant1 implements SocketAdapter
{
	private Socket sock1 = new Socket();
	
	
	
	@Override
	public Electricity get120Volt() 
	{
		return sock1.getVolt();
	}

	@Override
	public Electricity get12Volt() 
	{
		return convertVolt(sock1.getVolt(), 10);
	}

	@Override
	public Electricity get3Volt() 
	{
		return convertVolt(sock1.getVolt(), 40);
	}
	
	private Electricity convertVolt(Electricity v, int divideByValue) 
	{
		return new Electricity(v.getVolts()/divideByValue);
	}

}
