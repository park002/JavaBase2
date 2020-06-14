package FIFOLIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKaKaotalk", "개발자"));

		while (!messageQueue.isEmpty()) { // 비어있지 않다면 true
			Message message = messageQueue.poll();
			switch (message.command) { // switch조건으로 정수,문자열,문자 가 올 수 있다.
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 SMS를 보냅니다.");
				break;
			default:
				System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
			}
		}
	}
}
