
public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("흰색", 5600);
		// 필드 값 읽기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔:" + myCar.color);
		System.out.println("최고속도:" + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		// 필드 값 변경

		System.out.println("현재 변경된 속도:" + myCar.speed);
	}

}
