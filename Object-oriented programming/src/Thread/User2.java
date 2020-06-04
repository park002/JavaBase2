package Thread;

public class User2 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) { // 100¹øÁö
		this.setName("User2");
		this.calculator = calculator;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		calculator.setMemory(50);
	}
}
