package com.xutao.demo2;

public class Fruitl {
    String name;
    int price;
    String addr;
    Fruitl(){}
    Fruitl(String n,int p,String a){
    	name=n;
    	price=p;
    	addr=a;
    }
    void show(){
    	System.out.println(name+"\t"+price+"\t"+addr);
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Fruitl f=new Fruitl("ƻ��",5,"ɽ��");
      f.show();
	}

}
