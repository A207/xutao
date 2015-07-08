package com.xutao.demo2;

public class StaticDemo1 {
     int age;
     
     void helo(){
    	 System.out.println("hello...");
     }
	/**
	 * @param args
	 */
     
     static int year=18;
     
    static void hi(){
    	System.out.println("hi...");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StaticDemo1 d=new StaticDemo1();
      d.age=year;
	}

}
