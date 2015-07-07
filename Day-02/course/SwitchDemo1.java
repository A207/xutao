package com.xutao.demo1;

import java.util.Scanner;

public class SwitchDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
	     int day=scanner.nextInt();
	     switch(day)
	     {
	     case 1:System.out.println("今天是星期一");break;
	     case 2:System.out.println("今天是星期二");break;
	     case 3:System.out.println("今天是星期三");break;
	     case 4:System.out.println("今天是星期四");break;
	     case 5:System.out.println("今天是星期五");break;
	     case 6:System.out.println("今天是星期六");break;
	     case 7:System.out.println("今天是星期日");break;
	     default:
	     }
	}

}
