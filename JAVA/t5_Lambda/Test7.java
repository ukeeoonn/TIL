package t5_Lambda;

// 람다식을 이용하여 수의 사칙연산하기
@FunctionalInterface
interface MyFunc7 {
	int calc(int x, int y);
}

@FunctionalInterface
interface MyFunc71 {
  double calc(int x, int y);
}

public class Test7 {

	public static void main(String[] args) {
		MyFunc7 add = (x, y) -> x + y;
		System.out.println("두수의 합 : " + add.calc(5, 10));
		
		MyFunc7 sub = (x, y) -> x - y;
		System.out.println("두수의 차 : " + sub.calc(5, 10));
		
		MyFunc7 mul = (x, y) -> x * y;
		System.out.println("두수의 곱 : " + mul.calc(5, 10));
		
		MyFunc7 div = (x, y) -> x / y;
		System.out.println("두수의 몫(정수) : " + div.calc(5, 10));
		
		MyFunc71 div2 = (x, y) -> (double) x / y;
		System.out.println("두수의 몫(실수) : " + div2.calc(5, 10));
	}
	
}
