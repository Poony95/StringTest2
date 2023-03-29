package exam1;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {

		Random r = new Random();
		TreeSet set = new TreeSet();
		while(set.size() != 6) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
	}

}
//중복 값이 나올 수 있기에 중복 값을 없애보기.()