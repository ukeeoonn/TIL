package t6_Map;

import java.util.HashMap;

// Map계열의 자료구조: 키(key), 값(value)로 구정된다.
// 순서구조가 아니다.
// 중복 허용? key는 불허, value은 허용
// 키를 문자? 숫자?.... 관계없다.
public class HashMap1 {
	public static void main(String[] args) {
		// HashMap<Integer, String> map = new HashMap<Integer, String>();
		HashMap<Integer, String> map = new HashMap<>();
		System.out.println("map의 크기 " + map.size());
		System.out.println();
		
		// 자료의 삽입(put)
		map.put(10, "Java");
		map.put(20, "Database");
		map.put(30, "HTML5");
		map.put(40, "CSS3");
		map.put(50, "Javascript");
		map.put(60, "jQuery");
		map.put(70, "JSP");
		map.put(80, "JSTL");
		map.put(90, "SpringFramework");
		System.out.println("map의 크기 " + map.size());
		System.out.println("map : " + map);
		System.out.println();
		
		// 검색(get) - 인덱스번호 검색(X), '키'로 검색한다.
		String name = map.get(40);
		System.out.println("name : " + name);
		System.out.println();
		
		// 값의 변경...(키를 통해서 값을 변경처리한다.)
		map.put(70, "PHP");
		System.out.println("map의 크기 " + map.size());
		System.out.println("map : " + map);
		System.out.println();
		
		// 값의 중복
		map.put(100, "PHP");
		System.out.println("map의 크기 " + map.size());
		System.out.println("map : " + map);
		System.out.println();
		
		// 삭제(remove)
		map.remove(50);
		System.out.println("map의 크기 " + map.size());
		System.out.println("map : " + map);
		System.out.println();
		
		// 모두삭제(clear)
		map.clear();
		System.out.println("map의 크기 " + map.size());
		System.out.println("map : " + map);
		System.out.println();
	}
}
