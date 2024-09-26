package hybridinheritance;

public class Daughter extends Father
{
	public void mol()
	{
		System.out.println("Mol");
		
	}
public static void main (String ags[])
{
	Daughter obj=new Daughter();
	obj.mol();
	obj.achan();
	obj.appoppan();
	
	Son x=new Son();
	x.mon();
	x.achan();
	x.appoppan();
}

}