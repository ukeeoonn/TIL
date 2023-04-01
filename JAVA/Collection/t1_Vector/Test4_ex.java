package t1_Vector;

import java.util.Vector;

// Vector클래스
// 6개의 중복되지 않는 무작위수 추출후 정렬하기
public class Test4_ex {
	public static void main(String[] args) {
		Vector<Integer> vos = new Vector<>();
		
		int cnt=0, item, sw;
		
		// 중복제거하기
		while(true) {
			item = (int)(Math.random()*(45-1+1))+1;	// *(범위) : 범위끝값-범위시작값+1
			sw = 0;
			for(int i=0; i<vos.size(); i++) {
				if(vos.get(i) == item) {
					sw = 1;
					break;
				}
			}
			if(sw != 0) continue;
			else if(cnt != 6) {
				vos.add(item);
				cnt++;
			}
			else break;
		}
		
		// 원본 출력
		System.out.println("원본결과");
		for(int vo : vos) {
		  System.out.print(vo + " / ");
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
		
		// 정렬 결과 출력
		System.out.println("정렬결과");
		for(int vo : vos) {
		  System.out.print(vo + " / ");
		}
		
	}
}
