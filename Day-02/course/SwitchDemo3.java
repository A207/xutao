package com.xutao.demo1;

public class SwitchDemo3 {

	/**
	 * @param args
	 */
	public enum day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int intDay=0;
        day day1=day.Wednesday;
        switch(day1)
        {
        case Monday:intDay=1;break;
		case Tuesday:intDay=2;
			break;
		case Wednesday:intDay=3;
			break;
		case Thursday:intDay=4;
			break;
		case Friday:intDay=5;
			break;
		case Saturday:intDay=6;
			break;
		case Sunday:intDay=7;
			break;

        
        }
        System.out.println(intDay);
        
	}

}
