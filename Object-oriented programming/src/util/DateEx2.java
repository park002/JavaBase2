package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx2 {
	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");
		System.out.println(sdf.format(now));

	}
}
