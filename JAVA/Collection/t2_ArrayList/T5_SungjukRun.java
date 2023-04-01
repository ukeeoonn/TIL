package t2_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class T5_SungjukRun {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<T5_SungjukVo> vos = new ArrayList<>();
		
		
		while(true) {
			T5_SungjukVo vo = new T5_SungjukVo();
			String name;
			int kor, eng, mat;
			
			System.out.print("성명을 입력하세요?(종료:999) ");
			name = scanner.next();
			if(name.equals("999")) break;
			
			System.out.print("국어 점수를 입력하세요? ");
			kor = scanner.nextInt();
			System.out.print("영어 점수를 입력하세요? ");
			eng = scanner.nextInt();
			System.out.print("수학 점수를 입력하세요? ");
			mat = scanner.nextInt();
			
			vo.setName(name);
			vo.setKor(kor);
			vo.setEng(eng);
			vo.setMat(mat);
			
			vos.add(vo);
		}
		
		int tot;
		double avg;
		for(T5_SungjukVo vo : vos) {
			tot = vo.getKor() + vo.getEng() + vo.getMat();
			avg = tot / 3.0;
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getKor() + "\t");
			System.out.print(vo.getEng() + "\t");
			System.out.print(vo.getMat() + "\t");
			System.out.print(tot + "\t");
			System.out.print(avg + "\n");
		}
		
		System.out.println("작업끝!!");
		
		scanner.close();
	}
}
