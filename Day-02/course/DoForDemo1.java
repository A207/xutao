package com.xutao.demo1;

public class DoForDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      System.out.println(1);
//      System.out.println(2);
//		int i=1;
//		while(i<=100){
//			System.out.println(i);
//			i++;
//		}
//		System.out.println(i);
//		do{
//			System.out.println(i);
//			i++;
//		}while(i<=100);
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		int [] interges={1,2,3,4};
		for(int i=0;i<interges.length;i++){
			System.out.println(interges[i]);
		}
		for(int i:interges)
			System.out.println(i);
	}

}
