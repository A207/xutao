package com.xutao.demo2;

public class Person {
     String name;
     int age;
     String address;
	/**
	 * @param args
	 */
//     Person(){
//    	 System.out.println("Person��Ĭ�Ϲ��췽��������...");
//     }
     
     Person(String n,int a,String ad){
    	 name=n;
    	 age=a;
    	 address=ad;
     }
     void introduce(){
    	 System.out.println("��Һã��ҽ�"+name+"����"+age+"��"+"����"+address);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person person=new Person("Jim",18,"UK");
//        person.name="����";
//        person.age=20;
//        person.address="USA";
       person.introduce();
	}

}
