package com.xutao.demo2;

public class ThisDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
class Person{
	String name;
	int age;
	String addresss;
	public Person(){}
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(String name,int age,String address){
		this(name,age);
		this.addresss=address;
	}
	

}
    Person person=new Person("Line",23,"CHINA");
	}

}
