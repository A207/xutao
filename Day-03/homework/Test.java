package thirddaywork;

import java.util.Scanner;

//用于测试
public class Test {
	
       public static void main(String[] args){
    	   
    	   Scanner scanner=new Scanner(System.in);
    	   int number;
    	   System.out.println("请输入所需要的武器数(1~3)： ");
    	   number=scanner.nextInt();
    	   Army myarmy=new Army(number);
//    	   System.out.println("在这里1"); 	 
//    	   System.out.println("在这里2");
//    	   System.out.println("在这里3");
    	   myarmy.addWeapon(new Tank());
    	   myarmy.addWeapon(new Flighter());
    	   myarmy.addWeapon(new WarShip());
//    	   System.out.println("在这里4");
 	       myarmy.attackAll();
//    	   System.out.println("在这里5");
    	   myarmy.moveAll();
       }
       
}
