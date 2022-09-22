package icici.loans.homeloans;

public class UserDefinedArray 
{
	int sno;
	String sname;
	
	public UserDefinedArray(int sno, String sname) 
	{
		super();
		this.sno = sno;
		this.sname = sname;
	}
	
	@Override
	public String toString() 
	{
		return "UserDefinedArray [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) 
	{
		UserDefinedArray obj = new UserDefinedArray(1744, "sai");
		//System.out.println(obj.sno);
		//System.out.println(obj.sname);
		System.out.println(obj);
		
		
		UserDefinedArray s1 = new UserDefinedArray(1744, "sai1");
		UserDefinedArray s2 = new UserDefinedArray(1745, "sai2");
		UserDefinedArray s3 = new UserDefinedArray(1746, "sai3");
		UserDefinedArray s4 = new UserDefinedArray(1747, "sai4");
		
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);*/
		
		UserDefinedArray[] st = new UserDefinedArray[4];
		st[0]=s1;
		st[1]=s2;
		st[2]=s3;
		st[3]=s4;
		
		for(UserDefinedArray p:st)
		{
			System.out.println(p);
		}
		
	}
}
