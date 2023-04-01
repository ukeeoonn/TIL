package t2_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class T3_Iterator {
	public static void main(String[] args) {
		ArrayList<Integer> vos = new ArrayList<>();
		vos.add(10);
		vos.add(20);
		vos.add(50);
		vos.add(6);
		vos.add(30);
		vos.add(20);
		vos.add(6);
		vos.add(22);
		
		System.out.println("vos : " + vos.toString());
		System.out.println("vos : " + vos);
		System.out.println();
		
		for(int vo : vos) {
			System.out.print(vo + " / ");
		}
		System.out.println();
		
		Iterator<Integer> iVos = vos.iterator();
		System.out.println("iVos : " + iVos);
		while(iVos.hasNext()) {
			int item = iVos.next();
			System.out.print(item + " / ");
		}
	}
}
