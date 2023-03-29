package exam1;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		set.add("오렌지");
		System.out.println("데이터 수: "+set.size());
		boolean f1 = set.add("포도");
		set.add("포도");
		System.out.println("데이터 수: "+set.size());
		boolean f2 = set.add("감");
		set.add("바나나");
		set.add("포도");
		System.out.println("데이터 수: "+set.size());
		System.out.println(set);
		System.out.println(f1);
		System.out.println(f2);
	}
}
// TreeSet은 중복값 출력 안하고, 오름차순으로 객체를 정렬함. 중복 값은 데이터 수에 포함되지도 않음.
