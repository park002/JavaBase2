package util;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR); // ��
		int month = now.get(Calendar.MONTH); // ��
		int day = now.get(Calendar.DAY_OF_MONTH); // ��

		int week = now.get(Calendar.DAY_OF_WEEK); // ����
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		default:
			strWeek = "��";
		}
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "��");
		System.out.print(month + "��");
		System.out.println(day + "��");
		System.out.println(strWeek + "���� ");
		System.out.print(hour + "��");
		System.out.print(minute + "��");
		System.out.print(second + "��");
	}
}
