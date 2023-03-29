package exam1;

import java.util.HashSet;

public class HashSetTest {
	//HashSet는 입력한 순서를 유지하지 않아요!
	public static void main(String[] args) {
		HashSet set = new HashSet<>();
		set.add("사과");
		set.add("포도");
		set.add("체리");
		set.add("오렌지");
		boolean f1 = set.add("포도");
		boolean f2 = set.add("레몬");
		System.out.println(set);
		System.out.println(f1);
		System.out.println(f2);
	}

}
