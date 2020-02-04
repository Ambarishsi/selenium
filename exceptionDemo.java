package sell_proj;

public class exceptionDemo {
	public static int divide()
	{int a=10 ;int b=0 ;
		return a/b; 
	}
	public static  int add()
	{
		int a=10 ;int b=20 ;
		return a+b; 
	}
	public static void main(String[] args) throws Exception {
		try {
		System.out.println(divide());
		}
		catch(Exception x)
		{
			System.out.println("infinity");
		}
		Thread.sleep(10000);
		System.out.println(add());
		
	}

}
