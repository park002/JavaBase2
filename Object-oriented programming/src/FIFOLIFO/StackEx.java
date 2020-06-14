package FIFOLIFO;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100)); // 동전을 끼운다
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		while (!coinBox.isEmpty()) { // 객체가 비어있지 않다면 true
			Coin coin = coinBox.pop(); // Top 부터 꺼낸다. (객체를 스택에서 제거)
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
