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
	//��������
	  int[][] score=new int[20][5];
	  
	 System.out.println("������������ΪѧԱ��core c++ ��corejava�� Servlet�� JSP��EJB�ɼ�"); 
	 System.out.println("��������ѧԱ��ŷֱ�Ϊ01,02...20.");
	  
	 //��ÿ������Ԫ�ظ�ֵ      ȡֵ0~100
	 for(int i=0;i<=19;i++){
		 for(int j=0;j<=4;j++){
			 Random rand=new Random();
			 score[i][j]=rand.nextInt(100);
		 }
	 }
	 //�Ա����ʽ����ɼ�
	 System.out.println("ѧԱ���"+"\t"+"core c++"+"\t"+"corejava"+"\t"+"Servlet"+"\t"+"\t"+"JSP"+"\t"+"\t"+"EJB");
	 int k=1;
     for(int i=0;i<=19;i++){ 
    	 System.out.print(k+":"+"\t");
    	 for(int j=0;j<=4;j++){
    		 System.out.print(score[i][j]+"\t"+"\t");
    	 }
    	 System.out.println();
    	k++;
     }
     
    //����ÿ��ѧԱ���ܷ֣��������һ��������
     int sum[]=new int[20];
     for(int i=0;i<=19;i++){
    	 sum[i]=0;
    	 for(int j=0;j<=4;j++){
    		 sum[i]+=score[i][j];
    	 }
     }
     
//     for(int i=0;i<=19;i++){                 //����洢���ܳɼ�
//    	  System.out.print(sum[i]+"\t");
//     }
     
      
     //������ѧԱ��ĳ�ſγ̵�ƽ����  
     int c=0;
     System.out.println("��������Ҫ��ѯƽ���ֵĿγ����ƣ�");
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
      System.out.println("�˿γ̵�ƽ����Ϊ��"+average);
	}

}
