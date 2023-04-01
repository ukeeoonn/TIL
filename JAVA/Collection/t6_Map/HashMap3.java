package t6_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap3 {
	public static void main(String[] args) {
		Map<String, List<H3_InforVo>> listMap = new HashMap<>();
		System.out.println("listMap : " + listMap);
		
		H3_InforVo vo = new H3_InforVo();
		vo.setName("홍길동");
		vo.setAge(25);
		
		List<H3_InforVo> vos = new ArrayList<>();
		vos.add(vo);
		
		listMap.put("성명1", vos);
		System.out.println("listMap : " + listMap);
		
		vo = new H3_InforVo();		
		vo.setName("김말숙");
		vo.setAge(33);
		vos.add(vo);
		
		listMap.put("성명2", vos);
		
		System.out.println("listMap : " + listMap);
		
	}
}
