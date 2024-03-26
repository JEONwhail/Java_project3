package quiz;

/*
 * 부호연산자
 * 코드를 보고 예상결과를 주석으로 작성하세요
 * */
public class Quiz_01 {

	public static void main(String[] args) {		
		int num = -10; // -10
		int result = +num; // -10
		// + 기호로 그대로 유지
		System.out.println(result);

		
		int num2 = -20; // -20
		int result2 = -num2; // 20
		// - 기호로 음수가 양수로 변환
		System.out.println(result2);
		
		//이 모든 값은 원본값이 유지가 되어 기호만 변경
	}

}
