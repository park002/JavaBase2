package _Practice;

public class Star {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("[������]");
		System.out.println("arr.length:" + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println("arr[" + i + "]" + arr[i]);
		}
		System.out.println("���� ��");
		int[] temp = new int[arr.length * 2];
		
		for(int i=0; i<arr.length; i++)
			temp[i] = arr[i];
			arr=temp; //arr�������� �� temp�� �����Ѵ� 
			//�迭�� ���������� ���ؼ��� ���� �� �� �ְ� , �ڽ��� ����Ű�� ���������� ���� �迭�� ��� �� �� ���� .
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) 
			System.out.println("arr["+i+"]"+arr[i]);
		
	}
}
