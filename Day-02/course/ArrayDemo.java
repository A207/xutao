package com.xutao.demo1;

public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
//       int a[];
//       int []a1;
//       
//       
//       a=new int[3];
//       int size=10;
//       a1=new int[size];
//       
//       
//      //数组初始化
//       a[0]=1;
//       a[1]=5;
//       a[2]=10;
//       int b[]={1,3,5,7,9};
      //int b2[]=new int[5]{2,4,6,8,10};
       //输出数组内容
       
//      for(int i=0;i<=a.length ;i++){
//    	  System.out.println(a[i]);
//      }
      //冒泡排序
      int c[]={8,5,7,4};
      int temp=0;
      for(int i=c.length -1;i>0 ;i--){
    	  for(int j=0;j<i;j++){
    		  if(c[i]<c[j]){
    			  temp=c[i];
    			  c[i]=c[j];
    			  c[j]=temp;
    			  
    		  }
    	  }
      }
      for(int i=0;i<=c.length ;i++){
    	  System.out.println(c[i]);
      }
	}

}
