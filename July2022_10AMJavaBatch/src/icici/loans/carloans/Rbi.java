package icici.loans.carloans;

public interface Rbi 
{
	int x = 10;
	
	public void withdrawl();
	public void deposit();
		
	public static void main(String[] args) 
	{
		//Rbi i1 = new Rbi();
		
		Rbi i ;
		
		i = new HDFC();
		i.deposit();
		i.withdrawl();
		
		i = new ICICI();
		i.deposit();
		i.withdrawl();
	}
}