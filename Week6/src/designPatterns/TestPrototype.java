package designPatterns;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
	
		Char3DModel mickeyMouse = new Char3DModel(CharacterType.DYSNEY, "red");
		
		Char3DModel mickeyMouse2 =(Char3DModel) mickeyMouse.clone();
		

	}

}
