package sell_proj;

import java.util.Scanner;

public class absclass implements abscalci {
	Scanner sc = new Scanner(System.in);
	int n1,n2;
	public static void main(String []args) {
	absclass n = new absclass();
	n.num1();
	n.num2();
	System.out.println(n.add());
	System.out.println(n.sub());
	
	}

	@Override
	public void num1() {
		// TODO Auto-generated method stub
		System.out.println("enter num 1");
		 n1 = sc.nextInt();
		
	}

	@Override
	public void num2() {
		// TODO Auto-generated method stub
		System.out.println("enter num 2");
		 n2 = sc.nextInt();
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		
		return n1+n2;
	}

	@Override
	public int sub() {
		// TODO Auto-generated method stub
		return n1-n2;
		
	}

}
