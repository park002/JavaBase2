package FIFOLIFO;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100)); // ������ �����
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while (!coinBox.isEmpty()) { // ��ü�� ������� �ʴٸ� true
			Coin coin = coinBox.pop(); // Top ���� ������. (��ü�� ���ÿ��� ����)
			System.out.println("������ ���� : " + coin.getValue() + "��");
		}
	}
}
