package prototype;

public class Test extends Human
{
	public static void main(String[] args) 
	{
        Human human1 = new Human("Erwan", "Le Tutour", 30);

        Human human2 = (Human) human1.startTheCloneWars();
        
        human1.showHuman();
        human2.showHuman();        
    }

}
