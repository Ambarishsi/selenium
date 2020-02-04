package sell_proj;
class z
{int b=100;
	public void x()
	{
		System.out.println("hello bro");
	}
	public void x(int a)
	{
		System.out.println(a);
	}
	public void x(int a,int b)
	{
		System.out.println( a+ " " +b);
	}
}
public class overloadingdemo {

	public static void main(String[] args) {
		z y=new z();
		y.x();
		y.x(5);
		y.x(10,15);
		
		

	}

}
