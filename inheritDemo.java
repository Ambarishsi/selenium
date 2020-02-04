package sell_proj;
class amitabh{
	 int a=5;
}
class sahrukh extends amitabh{
	public int volume()
	{	int v = super.a;
		int b=6;
		int c=2;
		return v*b*c;
	}
}

public class inheritDemo {

	
	public static void main(String[] args) {
		sahrukh x = new sahrukh();
		System.out.println(x.volume());
		

	}

}
