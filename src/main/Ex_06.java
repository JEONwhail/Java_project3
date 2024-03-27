 package main;

 /*
  * 논리연산자
  * */
public class Ex_06 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		
		boolean flag1 = (x > 0) && (y > 0);
		System.out.println(flag1);
		
		boolean flag2 = (x < 0) && (y > 0); 
		System.out.println(flag2);
		
		boolean flag3 = (x > 0) || (y > 0); 
		System.out.println(flag3);
		
		boolean flag4 = (x > 0) || (y < 0); 
		System.out.println(flag4);
		
		boolean flag5 = !(x > 0); 
		System.out.println(flag5);
		
	}
}
