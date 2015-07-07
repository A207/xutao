package com.xutao.demo1;

import java.util.Scanner;

public class SwitchDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	     String dayString=scanner.nextLine();
	     int day=0;
	     switch(dayString.toLowerCase()){
	     case "Monday": day=1;break;
	     case "Tuesday": day=2;break;
	     case "Wednesday": day=3;break;
	     case "Thursday": day=4;break;
	     case "Friday": day=5;break;
	     case "Saturday": day=6;break;
	     case "Sunday": day=7;break;
	     
	     default:day=0;
	     }
	     
	     if(day==0)
	     {
	    	 System.out.println("Œﬁ–ß ‰»Î");
	     }
	     else{
	    	 System.out.println(day);
	     }
	}

}
