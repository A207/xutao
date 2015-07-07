package com.xutao.demo2;

import java.util.Scanner;

public class PrintNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		for(int i=1;i<=num;i++){
			for(int j=0;j<=num-i;j++){
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i-1;j++){
				if(i<=9){
				System.out.print(i);
				}
				if(i==10){
					System.out.print('A');
				}
				if(i==11){
					System.out.print('B');
				}
				if(i==12){
					System.out.print('C');
				}
				if(i==13){
					System.out.print('D');
				}
			}
			System.out.println();
			
		}
		
		
		
//打印如下图案：
//             1
//            222
//           33333
//                                   。。。。。。
//        DDDDDDDDDDD
	}

}
