package exam1;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap map = new TreeMap<>();
		map.put("name", "홍길동");
		map.put("name", "홍길동");
		map.put("age", 20);
		map.put("phone", "010-111-1111");
		map.put("addr", "서울");
		System.out.println(map.size());
		System.out.println(map);
		
	}

}
// TreeMap은 오름차순으로 객체를 정렬함, 중복을 표시하지 않음, 중복은 데이터 수에 포함되지 않음.
// Map은 key를 기준으로 정렬합니다.