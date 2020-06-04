package util;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // 년
		int month = now.get(Calendar.MONTH); // 월
		int day = now.get(Calendar.DAY_OF_MONTH); // 일

		int week = now.get(Calendar.DAY_OF_WEEK); // 요일
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "년");
		System.out.print(month + "월");
		System.out.println(day + "일");
		System.out.println(strWeek + "요일 ");
		System.out.print(hour + "시");
		System.out.print(minute + "분");
		System.out.print(second + "초");
	}
}
