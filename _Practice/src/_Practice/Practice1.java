package _Practice;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int Room = 100000;
		String CheckIn = "2020-05-25";
		String CheckOut="2020-05-31";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd"); //���� ���ϴ� ��¥ ������ ���� (����)
	    Date CheckInDate =  formatter.parse(CheckIn);
		Date CheckOutDate = formatter.parse(CheckOut);
	    long DateDiff = CheckOutDate.getTime() - CheckInDate.getTime(); //6��
	    long diff = DateDiff / (24 * 60 * 60 * 1000) +1; //7��
	    int RoomPrice = Room*(int)diff;
	    DecimalFormat df = new DecimalFormat("#,###");
	      String Com = df.format(RoomPrice);

	   
	  
	   
	     
		
	}

}
