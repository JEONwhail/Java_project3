package quiz;

/*
 * 산술연산자, 비교연산자
 * 1. 7이 홀수가 맞는지 확인하고 결과 출력
 * 2. 10이 짝수가 맞는지 확인하고 결과 출력
 */
public class Quiz_06 {

	public static void main(String[] args) {

		
		int value1 = 7 % 2; 
		boolean result1 = (value1 == 1); 
		System.out.println(result1);
		
		
		int value2 = 10 % 2;
		boolean result2 = (value2 == 0);
		System.out.println(result2);
	}

}
