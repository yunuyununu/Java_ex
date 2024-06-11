package ch12;

import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR)); // 년도
		System.out.println(cal.get(Calendar.MONTH)+1); // 월
		System.out.println(cal.get(Calendar.DATE)); // 일
		System.out.println(cal.get(Calendar.HOUR)); // 시 (12시간제)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 시 (24시간제)
		System.out.println(cal.get(Calendar.MINUTE)); // 분
		System.out.println(cal.get(Calendar.SECOND)); // 초
		System.out.println(cal.get(Calendar.AM_PM)); // 오전 오후
		if(cal.get(Calendar.AM_PM)==0) {
			System.out.println("am");// 0이면 am
		} else {
			System.out.println("pm"); // 1dl면 pm
		}
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); // 일~토 1~7
		String a = "";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			a = "Sunday";
			break;
		case 2:
			a = "Monday";
			break;
		case 3:
			a = "Tuesday";
			break;
		case 4:
            a = "Wednesday";
            break;
        case 5:
            a = "Thursday";
            break;
        case 6:
            a = "Friday";
            break;
        case 7:
            a = "Saturday";
            break;
		}
		System.out.println("Today is " + a);
	}

}
