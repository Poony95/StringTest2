package exam1;

import java.util.LinkedHashSet;

public class LinkedHashTest {
	//LinkedHashSet은 입력한 순서를 유지합니다. 중복 값은 없앱니다.
	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet<>();
		set.add("사과");
		set.add("포도");
		set.add("수박");
		boolean f1 = set.add("포도");
		boolean f2 = set.add("오렌지");
		System.out.println(set);
		System.out.println(f1);
		System.out.println(f2);
	}

}
