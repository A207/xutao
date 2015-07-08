package thirddaywork;

 public class Army {
	
   
	private Weapon w[]=null;
	private int i=0;

    private Army(){}
    public Army(int num){
     w=new Weapon[num];//通过修改d的值来对数组的长度进行控制
     }
     void addWeapon(Weapon wa){    //增加武器到武器库中
//    	System.out.println("在这里6");
    	
    	if(i<w.length){
    	w[i]=wa;
    	}
//    	System.out.println("99");
//    	System.out.println("在这里7");
    	i++;

    }

     
     void attackAll(){           //让数组中的所有武器攻击
//    	 System.out.println("88");
    	for(Weapon wea:w){
    		if(wea!=null){
    	    wea.attack();
    		}
//    	System.out.println("在这里8");
    	}
     }
     void moveAll(){             //让数组中的所有武器移动
    	for(Weapon wea:w){
    		if(wea!=null){
    		wea.move();
    		}
//    		System.out.println("在这里9");
    	}
     }
}
