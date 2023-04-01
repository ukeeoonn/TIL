package t5_Lambda;

// 람다식을 구현하기 위해서는 '함수형 인터페이스'를 먼저 생성해 주어야한다.
// 함수형인터페이스 : 추상메소드가 단 1개인 인터페이스를 말함.
@FunctionalInterface
interface MyFunc4 {
	int add(int x, int y);
}

// 2.구현객체를 메소드 안에서 만들어서 사용한다.
public class Test4 {
	
	public static void main(String[] args) {
		
//		MyFunc4 myFunc4 = new MyFunc4() {
//			@Override
//			public int add(int x, int y) {
//				return x + y;
//			}
//		};
		
		// 람다식 만들기....
		// '접근제한자/리턴타입/메소드명/매개변수의 타입' 생략가능,
		// 앞의 것들을 생략하면서 () 뒤에 '->' 를 붙여준다.
//		MyFunc4 myFunc4 = (x, y) -> {
//			return x + y;
//		};
		
		// 실행문이 1줄이면 중괄호 생략하면서, return 도 생략한다.
		MyFunc4 myFunc4 = (x, y) -> x + y;
	;
		
		int res = myFunc4.add(150, 200);
		System.out.println("두수의 합 : " + res);
	}
}
