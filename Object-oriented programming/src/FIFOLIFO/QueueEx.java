package FIFOLIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "ȫ�浿"));
		messageQueue.offer(new Message("sendSMS", "�ſ��"));
		messageQueue.offer(new Message("sendKaKaotalk", "������"));

		while (!messageQueue.isEmpty()) { // ������� �ʴٸ� true
			Message message = messageQueue.poll();
			switch (message.command) { // switch�������� ����,���ڿ�,���� �� �� �� �ִ�.
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendSMS":
				System.out.println(message.to + "�Կ��� SMS�� �����ϴ�.");
				break;
			default:
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�.");
			}
		}
	}
}
