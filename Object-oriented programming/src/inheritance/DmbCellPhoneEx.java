package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone Dmb = new DmbCellPhone("갤럭시20", "블랙", 65);
		System.out.println("모델 : " + Dmb.model);
		System.out.println("색상 : " + Dmb.color);
		System.out.println("채널 : " + Dmb.channel);
		Dmb.powerOn();
		Dmb.bell();
		Dmb.sendVoice("여보세요");
		Dmb.receiveVoice("어 나야");
		Dmb.sendVoice("니가 누군데");
		Dmb.hangUp();
		Dmb.turnOnDmb();
		Dmb.changeChannelDmb(60);
		Dmb.turnOffDmb();

	}

}
