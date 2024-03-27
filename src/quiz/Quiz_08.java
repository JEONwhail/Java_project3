package quiz;


public class Quiz_08 {

	public static void main(String[] args) {

//		(1) int형변수 x를 선언하고 80을 대입하세요
//		논리연산자를 사용하여 x가 50<x<100 범위에 속해있다면 결과를 출력하세요
		int x = 80;
		boolean bool = (x>50) && (x<100);
		System.out.println(bool);
		
//		(2) int형변수 y를 선언하고 5을 대입하세요
//		논리연산자를 사용하여 y가 10보다 작거나 30보다 크면 결과를 출력하세요
		int y = 5;
		boolean bool2 = (y<10) || (y>30);
		System.out.println(bool2);
	}

}
