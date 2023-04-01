package t1_Vector;

import java.util.Random;
import java.util.Vector;

// Vector클래스
// 10개의 무작위수 추출후 정렬하기
public class Test3_ex {
	public static void main(String[] args) {
		// Vector<String> names = new Vector<String>();
		Vector<Integer> vos = new Vector<>();
		Random random = new Random();	// (범위) : 범위끝값-범위시작값+1
		
		for(int i=0; i<10; i++) {
			// vos.add((i+1)*10);
			vos.add(random.nextInt(100-1+1));
		}
		
		int cnt = 0;
		for(int i=0; i<vos.size(); i++) {
			for(int j=0; j<3; j++) {
				if(cnt != vos.size()) {
					System.out.print((cnt+1)+".su : " + vos.get(cnt) + " \t ");
					cnt++;
				}
				else break;
			}
			if(cnt == vos.size()) break;
			else System.out.println();				
		}
		System.out.println("\n");
		
		// 정렬하기
		int temp;
		for(int i=1; i<=vos.size()-1; i++) {
			for(int j=i+1; j<=vos.size(); j++) {
				if(vos.get(i-1) > vos.get(j-1)) {
					temp = vos.get(i-1);
					vos.set(i-1, vos.get(j-1));
					vos.set(j-1, temp);
				}
			}
		}
		
		// 출력
		System.out.println("정렬결과");
		for(int vo : vos) {
		  System.out.print(vo + " / ");
		}
		
	}
}
