package quiz;


public class Quiz_10 {

	public static void main(String[] args) {

		int result1 = -5 + 3 * 10 / 2; //3*10/2가 먼저 수행 -5 + 15가 수행 10
		System.out.println(result1); //10
		
		int x = 1;	
		int result2 = (++x) + 5; // 먼저 x값을 1증가시키고, + 5를 수행함 -> 2 + 5 7
		System.out.println(result2); //7
		
		
	}

}
