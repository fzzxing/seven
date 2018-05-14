package seven;

import java.util.Scanner;

public class MathTest
{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter");
		int a=sc.nextInt();
		System.out.println("enter");
		int b=sc.nextInt();
		Ma m=new Ma();
		System.out.println("add:"+m.add(a, b)+"  sub:"+m.sub(a, b)+"  mul:"+m.mul(a, b)+"  div:"+m.div(a, b));
	}

}
class Ma{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
	public static int random()
	{
		// TODO Auto-generated method stub
		return 0;
	}
}
