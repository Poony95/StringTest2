package exam1;

import java.util.Iterator;
import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		Random r = new Random();
		int []n = new int[6];
		
		for (int i = 0; i < 6; ) {
			int num = r.nextInt(45)+1;
			int k=0;
			for (k = 0; k < i; k++) {
				if(num == n[k]) {
					break;
				}
			}
			if(k <i)
				continue;
			n[i]=num;
			i++;
		}
		System.out.println("*** 이번주 로또 추천 번호 ***");
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i]+ " ");
		}
	}

}
