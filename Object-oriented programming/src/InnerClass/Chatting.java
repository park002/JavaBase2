package InnerClass;

public class Chatting {
	
	void startChat(final String chatId) {
		String nickName = chatId;

		class Chat {
			public void start() {
				while (true) {
					String inputData = "�ȳ��ּ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}

			void sendMessage(String message) {

			}
		}
		Chat chat = new Chat();
		chat.start();
	}

}
