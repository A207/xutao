package com.xutao.demo2;
//用于输出1~100之间的所有质数
public class ContBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

     for(int i=2,j=2;i<=100;i++){
    	  for(;j<i;j++){
 //   		  System.out.println("i = " + i + ", j = " + j + (i%j!=0));  
    		  if(i%j!=0) {
    			  continue;   
    		  }
    		  else {
//     		  System.out.println("else");  
    			  break; 
    		  }
      	  }
  //  	  System.out.println("到这里111");
    	  if(i==j){      // 根据i，j关系输出结果
    	  System.out.println(i);
    	  }
  //  	  System.out.println("到这里222");
    	  j=2;           //j值初始化
    	  }
    	 
	 }	
      	
}
