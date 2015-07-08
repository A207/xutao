package com.xutao.demo2;

public class Person {
     String name;
     int age;
     String address;
	/**
	 * @param args
	 */
//     Person(){
//    	 System.out.println("Person的默认构造方法被调用...");
//     }
     
     Person(String n,int a,String ad){
    	 name=n;
    	 age=a;
    	 address=ad;
     }
     void introduce(){
    	 System.out.println("大家好，我叫"+name+"今年"+age+"岁"+"我在"+address);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person=new Person("Jim",18,"UK");
//        person.name="张三";
//        person.age=20;
//        person.address="USA";
       person.introduce();
	}

}
