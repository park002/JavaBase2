package inheritance;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone Dmb = new DmbCellPhone("������20", "��", 65);
		System.out.println("�� : " + Dmb.model);
		System.out.println("���� : " + Dmb.color);
		System.out.println("ä�� : " + Dmb.channel);
		Dmb.powerOn();
		Dmb.bell();
		Dmb.sendVoice("��������");
		Dmb.receiveVoice("�� ����");
		Dmb.sendVoice("�ϰ� ������");
		Dmb.hangUp();
		Dmb.turnOnDmb();
		Dmb.changeChannelDmb(60);
		Dmb.turnOffDmb();

	}

}
