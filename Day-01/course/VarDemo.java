package com.xutao.demo1;

public class VarDemo {
 static int age;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     VarDemo demo1=new VarDemo();
     System.out.println(age);
     demo1.add();
     System.out.println(age);
     VarDemo demo2=new VarDemo();
     demo2.show();
     System.out.println(age);
     demo2.add();
     System.out.println(age);
     demo2.min(age);
     demo1.min(age);
	}
	public void add()
	{
		age++;
		
	}
    public void show()
    {
    	int age=20;
    	System.out.println(age);
    }
    public void min(int i)
    {
    	int j=10;
    	if(i<j){
    		int k=i;
    		System.out.println(k);
    	}
    }
}
