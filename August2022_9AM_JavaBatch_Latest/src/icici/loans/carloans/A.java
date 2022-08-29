package icici.loans.carloans;

import java.util.Date;

public  class A 
{
	public int x  = 100;
	public final static String came = "vmware";
	
	public  void m1()
	{
		System.out.println("iam m1 from A");
		x = 10;
	}
	
	public final static void m5()
	{
		System.out.println("iam m5 static in A Class");
	}
	
	static
	{
		System.out.println("iam static block....");
	}
	
	static
	{
		Date d = new Date();
		System.out.println(d);
	}

	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		System.out.println(a.x);
		A.m5();
	}

}
