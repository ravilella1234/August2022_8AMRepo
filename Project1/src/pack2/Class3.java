package pack2;

import pack1.Class1;

public class Class3 extends Class1
{

	public Class3(int x, int y) 
	{
		super(x, y);
	}

	public static void main(String[] args) 
	{
		Class3 c3 = new Class3(10, 20);
		c3.add();
		c3.sub();
	}

}
