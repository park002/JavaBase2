package _Practice;

public class Star {

	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("[변경전]");
		System.out.println("arr.length:" + arr.length);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.println("arr[" + i + "]" + arr[i]);
		}
		System.out.println("변경 후");
		int[] temp = new int[arr.length * 2];
		
		for(int i=0; i<arr.length; i++)
			temp[i] = arr[i];
			arr=temp; //arr참조변수 는 temp를 참조한다 
			//배열은 참조변수를 통해서만 접근 할 수 있고 , 자신을 가리키는 참조변수가 없는 배열은 사용 할 수 없다 .
		System.out.println(arr.length);
		for(int i=0; i<arr.length; i++) 
			System.out.println("arr["+i+"]"+arr[i]);
		
	}
}
