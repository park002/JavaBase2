package InnerClass;

public class Test1 {

	abc abInterface;

	class Test2 implements abc {
		Test2(abc a) {
			
		}
		int a;
		int b;
		int c;
		int d;
		@Override
		public void zzz() {
			// TODO Auto-generated method stub
			System.out.println("�Ű������� ��ü��.������ ����");
		}

	
	}

	static interface abc {
		void zzz();
	}
}
