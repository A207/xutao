package com.xutao.demo2;
//�������1~100֮�����������
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
  //  	  System.out.println("������111");
    	  if(i==j){      // ����i��j��ϵ������
    	  System.out.println(i);
    	  }
  //  	  System.out.println("������222");
    	  j=2;           //jֵ��ʼ��
    	  }
    	 
	 }	
      	
}
