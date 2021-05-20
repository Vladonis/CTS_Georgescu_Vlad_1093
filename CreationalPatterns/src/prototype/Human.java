package prototype;

public class Human implements PrototypeInterface
{
	private String name;
	private String lastname;
	private int age;
	
	public Human()
	{
        System.out.println(" Human description ");
        System.out.println("---------------------------------");
        System.out.println("Name"+"\t"+"Last Name"+"\t"+"Age");
    }
	
	public Human(String name, String lastname, int age) 
	{
		super();
		this.name = name;
		this.lastname = lastname;
		this.age = age;    
	}
	
	public void showHuman()
	{
        System.out.println(name+"\t"+lastname+"\t"+age);
	}

	@Override
	public PrototypeInterface startTheCloneWars() 
	{
		 return new Human(name, lastname, age);	
	}
	
	

	

}
