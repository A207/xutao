package com.xutao.demo2;

public class InitialDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Personnal personnal=new Personnal(20);
    System.out.println(personnal.age);
	}

}
class Personnal{
	Personnal(int age){
		this.age=age;
	}
	{
		age=18;
	}
	int age;
}
