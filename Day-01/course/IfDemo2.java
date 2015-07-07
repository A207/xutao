package com.xutao.demo1;

import java.util.Scanner;

public class IfDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner=new Scanner(System.in);
	     int score=scanner.nextInt();
	     if(score>=90)
    	 {
    		 System.out.println("等级为A");
    	 }
    	 else if(score>=80)
    	 {
    		 System.out.println("等级为B");
    	 }
    	 else if(score>=70)
    	 {
    		 System.out.println("等级为C");
    	 }
    	 else if(score>=60)
    	 {
    		 System.out.println("等级为D");
    	 }
    	 else
    	 {
    		 System.out.println("等级为E");
    	 }
	}

}
