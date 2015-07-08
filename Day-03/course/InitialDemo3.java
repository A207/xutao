package com.xutao.demo2;

public class InitialDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(B.instance.num2);
      System.out.println(new B(1).num2);
	}

}
class B{
	static B instance=new B(1);
	static int num1=5;
	int num2;
	B(int num3){
		num2=num1-num3;
	}
}