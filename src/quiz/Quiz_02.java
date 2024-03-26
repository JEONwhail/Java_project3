package quiz;

/*
 * 증감연산자
 * 코드가 수행되고 난 다음에 x, y, result의 값을 예상해서 적어보세요
 * */
public class Quiz_02 {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int result = (x++) + (--y);
	     //              11    19
		// 29
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(result);
	}
}
