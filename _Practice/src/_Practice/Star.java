package _Practice;

import java.util.UUID;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			for(int i=0; i<5; i++) {
				String UUIDTEST = UUID.randomUUID().toString().replace("-", "");
				System.out.println("    "+UUIDTEST);
			}
	}
}
