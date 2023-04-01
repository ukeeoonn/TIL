package t5_Lambda;

@FunctionalInterface
interface MyFunc5 {
	int add(int x, int y);
}

public class Test5 {
	
	public static void main(String[] args) {
		
		MyFunc5 myFunc5 = (x, y) -> x + y;
		
		int res = myFunc5.add(30, 200);
		System.out.println("두수의 합 : " + res);
	}
}
