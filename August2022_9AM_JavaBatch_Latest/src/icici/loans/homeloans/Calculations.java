package icici.loans.homeloans;

public class Calculations 
{

	int x, y, results;
	
	public Calculations(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void add()
	{
		results = x + y;
		System.out.println("Add of A & B is : " +  results);
	}
	
	public void sub()
	{
		results = x - y;
		System.out.println("Sub of A & B is : " +  results);
	}

	public static void main(String[] args) 
	{
		Calculations obj = new Calculations(100, 200);
		obj.add();
		obj.sub();
	}

}
