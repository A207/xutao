package thirddaywork;

 public class Army {
	
   
	private Weapon w[]=null;
	private int i=0;

    private Army(){}
    public Army(int num){
     w=new Weapon[num];//ͨ���޸�d��ֵ��������ĳ��Ƚ��п���
     }
     void addWeapon(Weapon wa){    //������������������
//    	System.out.println("������6");
    	
    	if(i<w.length){
    	w[i]=wa;
    	}
//    	System.out.println("99");
//    	System.out.println("������7");
    	i++;

    }

     
     void attackAll(){           //�������е�������������
//    	 System.out.println("88");
    	for(Weapon wea:w){
    		if(wea!=null){
    	    wea.attack();
    		}
//    	System.out.println("������8");
    	}
     }
     void moveAll(){             //�������е����������ƶ�
    	for(Weapon wea:w){
    		if(wea!=null){
    		wea.move();
    		}
//    		System.out.println("������9");
    	}
     }
}
