package com.xutao.demo2;
//一个类中，如果有抽象方法，那么这个类就是抽象类
public abstract class Animal {

	public abstract void sleep();//如果一个方法没有方法主题，就是一个抽象方法
}

class tiger extends Animal{//子类继承父类要实现所有的抽象类，否则子类也是抽象类
	public void sleep(){
		System.out.println("趴着睡。。。");
	}
}

class monkey extends Animal{
	public void sleep(){
		System.out.println("仰着睡。。。");
	}
}