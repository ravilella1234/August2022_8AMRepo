package icici.loans.homeloans;

class Parent
{
	public void workhard()
	{
		System.out.println("Parent : wakeup early, goto college");
	}
	
	public void care()
	{
		System.out.println("Parent : atmost care...");
	}
}

public class Child extends Parent
{
	public void workhard()
	{
		System.out.println("Child : wakeup anytime, goto movie");
	}
	
	public void love()
	{
		System.out.println("Child : iam in love...");
	}

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.workhard();
		c.care();
		c.love();
	}
}
