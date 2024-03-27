package quiz;

/*
 * 수학점수  90
 * 영어점수  70
 * 국어점수  100
 * 점수의 총점과 평균
 * */
public class Quiz_04 {

	public static void main(String[] args) {

		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		
		int totalScore = mathScore + engScore + korScore;
		System.out.println(totalScore); 
		
		double total = totalScore / 3.0;
		System.out.println(total);

	}
}
          