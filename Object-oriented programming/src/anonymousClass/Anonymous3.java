package anonymousClass;

public class Anonymous3 {
	private int field;

	public void method(final int arg1, int arg2) {// �͸�����ü�� ���������� ����Ѵ�

		int var1 = 0;
		int var2 = 0;
		field = 10;
		field = 20;

		Calculatable calc = new Calculatable() {
			// �͸�����ü �ڽ��̴�.
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}
