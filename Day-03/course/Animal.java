package com.xutao.demo2;
//һ�����У�����г��󷽷�����ô�������ǳ�����
public abstract class Animal {

	public abstract void sleep();//���һ������û�з������⣬����һ�����󷽷�
}

class tiger extends Animal{//����̳и���Ҫʵ�����еĳ����࣬��������Ҳ�ǳ�����
	public void sleep(){
		System.out.println("ſ��˯������");
	}
}

class monkey extends Animal{
	public void sleep(){
		System.out.println("����˯������");
	}
}