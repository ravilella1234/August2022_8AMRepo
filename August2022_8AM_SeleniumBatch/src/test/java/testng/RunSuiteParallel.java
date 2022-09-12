package testng;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel 
{

	public static void main(String[] args) 
	{
		String s = "ravi";
		
		/*String[] s1 = new String[3];
		s1[0]="a1";
		s1[1]="a2";
		s1[2]="a3";
		
		String[] s2 = {"a1","a2","a3"};
		
		String[] s3 = new String[] {"a1","a2","a3"};*/
		
		TestNG obj = new TestNG();
		obj.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		obj.setSuiteThreadPoolSize(2);
		obj.run();
	}

}
