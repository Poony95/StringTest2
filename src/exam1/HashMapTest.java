package exam1;

import java.util.HashMap;

public class HashMapTest {
	//HashMap는 입력한 순서를 유지하지 않아요!

	public static void main(String[] args) {
//		ArrayList list = new ArrayList();
//		list.add("홍길동");
//		list.add("서울시 마포구 서교동");
//		list.add(24);
/*
 		위의 리스트의 경우
 		주소가 1번째 인덱스에 있는지
 		2번째 인덱스에 있는지 기억하고 있기가 어려워요.
 		
 		이러한 데이터를 저장해야 한다면
 		map을 이용하면 좋아요
 		
 		map은 인덱스에 대신에 
 		key에 의해 데이터에 접근하는 방식입니다.
 */
		
		HashMap map = new HashMap();
		map.put("name", "홍길동");
		map.put("addr","서울시 마포구 서교동");
		map.put("age", 24);
		
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("addr"));
		
		System.out.println(map);
	}

}
