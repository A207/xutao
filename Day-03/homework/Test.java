package thirddaywork;

import java.util.Scanner;

//���ڲ���
public class Test {
	
       public static void main(String[] args){
    	   
    	   Scanner scanner=new Scanner(System.in);
    	   int number;
    	   System.out.println("����������Ҫ��������(1~3)�� ");
    	   number=scanner.nextInt();
    	   Army myarmy=new Army(number);
//    	   System.out.println("������1"); 	 
//    	   System.out.println("������2");
//    	   System.out.println("������3");
    	   myarmy.addWeapon(new Tank());
    	   myarmy.addWeapon(new Flighter());
    	   myarmy.addWeapon(new WarShip());
//    	   System.out.println("������4");
 	       myarmy.attackAll();
//    	   System.out.println("������5");
    	   myarmy.moveAll();
       }
       
}
