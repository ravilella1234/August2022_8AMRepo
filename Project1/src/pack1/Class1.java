package pack1;

public class Class1 
{
	
	int x, y, results;
	
	public Class1(int x, int y) 
	{
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
		Class1 obj = new Class1(100, 200);
		obj.add();
		obj.sub();
	}

}
