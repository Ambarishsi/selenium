package sell_proj;

public class staticDemo {
	static int a ;
	
	static void i()
	{
		System.out.println("input");
	
	}
	static void o()
	{
		System.out.println("output");
		System.out.println(a);
	}
	public static void main(String[] args) {
		staticDemo.a=10;
		staticDemo.i();
		staticDemo.o();
	}

}
