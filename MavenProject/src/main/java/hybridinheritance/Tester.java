package hybridinheritance;

public class Tester extends Employee
{
int QA=20;

public void analysts()
{
	System.out.println("Analysts count: "+QA);
}
public static void main(String args[])
{
	Tester org=new Tester();
	org.detail();
	org.analysts();
	//System.out.println(org.QA);
	//System.out.println(org.name);
		
		Developer obj=new Developer();             //developer child ne ivide vilikkunnathanu ee step
		obj.detail();
		obj.count();
		//System.out.println(obj.total);
		//System.out.println(obj.name);
	}
}
