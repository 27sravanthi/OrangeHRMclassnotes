package Day044_Return_Values;

import java.util.Scanner;

import org.testng.annotations.Test;

public class TC001_Return_Single_Value {
	
	
	
	@Test
	public void Test5() throws Exception {
		

		
		/*Scanner c1 = new Scanner(System.in);
		System.out.println("enter x1 ");
		
		int x1=c1.nextInt();
		
		System.out.println("enter y1 ");
		int y1=c1.nextInt();
		*/
		
		
		
		
		
		TC001_Return_Single_Value h1= new TC001_Return_Single_Value();
		
		
		String str2;
		
		
		
		str2= h1.addstrings("Hello");
		System.out.println("updated string value is " +str2);
		
		
		
		int dd1= h1.Add(30000,400);
		
		
		
		System.out.println("sum of a,b " +dd1);
		System.out.println("___****Sum ****_____" );
		
		
		int e= h1.multiplication(50,40);
		System.out.println("multiplication of a,b " +e);
		System.out.println("___****Mul ****_____" );
		

		int f= h1.subtract(50,60);
		System.out.println("subtract of a,b " +f);
		
		

		int g= h1.division(20,10);
		System.out.println("division of a,b " +g);
		
		
		int k=simpleInterest(5000,2,10);
		System.out.println(k);


	}
	

	
	
	public int simpleInterest(int p,int t,int r)
	{
		
		int si=(p*t*r)/100;
		return si;
	}
	
	
	//method with arguements
	public int Add(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int d=a+b;
	
	System.out.println("Sum of a,b " +d);
	
	return d;
	}
	
	
	

	//method with arguements
	public int multiplication(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int d=a*b;
	
	
	return d;
	}
	
	
	
	public String addstrings(String str)
	{
		
		String str1=str + "World";
		
		return str1;
	}

	

	//method with arguements
	public int subtract(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=a-b;
	
	//System.out.println("Sum of a,b " +d);
	
		return f;
	}
	
	
	
	

	//method with arguements
	public int division(int a,int b)
	{
	//System.out.println("a value is" +a);
	//System.out.println("b value is" +b);
	
	int f=a/b;
	
	
	
	return f;
	}
	
	

}
