package builder;

public class Computer 
{
	//required parameters  (set to public for testing only)
	public String hdd;
	public String ram;
	
	//optional parameters (set to public for testing only)
	public boolean gpuEnabled;
	public boolean diskReaderEnabled;
	
	//------------getters----------
	public String getHdd() {
		return hdd;
	}	
	public String getRam() {
		return ram;
	}
	
	public boolean isGpuEnabled() {
		return gpuEnabled;
	}
	public boolean isDiskReaderEnabled() {
		return diskReaderEnabled;
	}
	
	//------------constructor----------	
	public Computer(ComputerBuilder builder) 
	{
		super();
		this.hdd = hdd;
		this.ram = ram;
		this.gpuEnabled = builder.gpuEnabledB;
		this.diskReaderEnabled = builder.diskReaderEnabledB;
	}

	//------------builder----------
	public static class ComputerBuilder{

		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean gpuEnabledB;
		private boolean diskReaderEnabledB;
		
		public ComputerBuilder(String hdd, String ram){
			this.HDD=hdd;
			this.RAM=ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGpuEnabled) {
			this.gpuEnabledB = isGpuEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean diskReaderEnabled) {
			this.diskReaderEnabledB = diskReaderEnabled;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}

	}
	
	
	

}
