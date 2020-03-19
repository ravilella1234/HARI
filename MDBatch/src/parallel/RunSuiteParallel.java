package parallel;

import java.util.Arrays;

import org.testng.TestNG;

public class RunSuiteParallel 
{

	public static void main(String[] args) 
	{
		String[] s1=new String[5];
		s1[0]="one";
		s1[1]="two";
		
		String[] s3 = new String[] {"one","two"};
		
		String[] s2= {"one","two"};
		
		TestNG testng=new TestNG();
		testng.setTestSuites(Arrays.asList(new String[] {System.getProperty("user.dir")+"//megasuite.xml"}));
		testng.setSuiteThreadPoolSize(2);
		testng.run();
	}

}
