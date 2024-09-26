package multilevelinheritance;

public class Puppy extends Dog
{
	String breed="German";
	
public void display()
{
	System.out.println("Breed :"+breed);
}
	public static void main(String[] args) 
	{
		Puppy x=new Puppy();
		x.food();
		x.sound();
		x.display();
		
		

	}

}
