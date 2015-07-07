package seconddaywork;

import java.util.Random;
import java.util.Scanner;

public class ExeArray {

	private static int summ;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//创建数组
	  int[][] score=new int[20][5];
	  
	 System.out.println("从左至右依次为学员的core c++ ，corejava， Servlet， JSP和EJB成绩"); 
	 System.out.println("从上至下学员编号分别为01,02...20.");
	  
	 //给每个数组元素赋值      取值0~100
	 for(int i=0;i<=19;i++){
		 for(int j=0;j<=4;j++){
			 Random rand=new Random();
			 score[i][j]=rand.nextInt(100);
		 }
	 }
	 //以表格形式输出成绩
	 System.out.println("学员编号"+"\t"+"core c++"+"\t"+"corejava"+"\t"+"Servlet"+"\t"+"\t"+"JSP"+"\t"+"\t"+"EJB");
	 int k=1;
     for(int i=0;i<=19;i++){ 
    	 System.out.print(k+":"+"\t");
    	 for(int j=0;j<=4;j++){
    		 System.out.print(score[i][j]+"\t"+"\t");
    	 }
    	 System.out.println();
    	k++;
     }
     
    //保存每个学员的总分，存放在另一个数组中
     int sum[]=new int[20];
     for(int i=0;i<=19;i++){
    	 sum[i]=0;
    	 for(int j=0;j<=4;j++){
    		 sum[i]+=score[i][j];
    	 }
     }
     
//     for(int i=0;i<=19;i++){                 //输出存储的总成绩
//    	  System.out.print(sum[i]+"\t");
//     }
     
      
     //求所有学员的某门课程的平均分  
     int c=0;
     System.out.println("请输入需要查询平均分的课程名称：");
     Scanner scanner=new Scanner(System.in);
       String course=scanner.nextLine();
       switch(course.toLowerCase()){
       case "core c++":c=0;break;
       case "corejava":c=1;break;
       case "Servlet":c=2;break;
       case "JSP":c=3;break;
       case "EJB":c=4;break;
       default:break;
       } 
      int summ=0;
      for(int i=0;i<=19;i++){
    	 
    	 summ=summ+score[i][c];
      }
      float average=0.0f;
      average=summ/20;
      System.out.println("此课程的平均分为："+average);
	}

}
