package t2_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class T1 {
	public static void main(String[] args) {
		// ArrayList<String> vos = new ArrayList<>();
		List<String> vos = new ArrayList<>();
		
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.add("홍길동");
		vos.add("김말숙");
		vos.add("이기자");
		vos.add("오하늘");
		vos.add("강감찬");
		
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		String name = vos.get(2);
		System.out.println("name : " + name);
		System.out.println();
		
		vos.set(2, "강기자");
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		vos.remove(2);
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
		
		name = vos.get(2);
		System.out.println("name : " + name);
		System.out.println();
		
		vos.clear();
		System.out.println("vos크기 : " + vos.size());
		System.out.println("vos : " + vos);
		System.out.println();
	}
}
