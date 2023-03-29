package arraylisttest;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	
	public static void menu() {
		System.out.println("메뉴를 선택하세요==>");
		System.out.println("1.추가 2.검색 3.삭제 4.모두출력  0.종료");
	}
	
	public static void insertStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		String name;
		String addr;
		String phone;		
		System.out.println("추가할 학생의 이름==>");
		name = sc.next();		
		System.out.println("추가할 학생의 주소==>");
		addr = sc.next();		
		System.out.println("추가할 학생의 전화==>");
		phone = sc.next();		
		list.add(new Student(name,addr,phone));
	}
	
	public static void searchStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		String phone;
		System.out.println("검색하려는 학생의 전화번호==>");
		phone = sc.next();
		Student st = null;
		for(int i=0;i<list.size();i++) {
			Student s= list.get(i);
			if(s.getPhone().equals(phone)) {
				st = s;
			}
		}
		if(st == null) {
			System.out.println("못 찾았습니다.");
		}else {
			System.out.println("찾았습니다.");
			System.out.println("이름:"+st.getName());
			System.out.println("주소:"+st.getAddr());
			System.out.println("전화:"+st.getPhone());
		}
		System.out.println("------------------------");
	}
	
	public static void deleteStudent(ArrayList<Student> list) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 학생의 전화==>");
		String phone = sc.next();
		boolean re = false;
		for(int i=0;i<list.size();i++) {
			Student s = list.get(i);
			if(s.getPhone().equals(phone)) {
				list.remove(i);
				re = true;
			}
		}
		if(re) {
			System.out.println("해당 학생의 정보를 삭제하였습니다.");
		}else {
			System.out.println("삭제하려는 학생의 정보는 없습니다.");
		}
		System.out.println("--------------------------");
	}
	
	public static void printAll(ArrayList<Student> list) {
		for(int i=0; i<list.size(); i++) {
			Student st= list.get(i);
			System.out.println("이름:"+st.getName());
			System.out.println("주소:"+st.getAddr());
			System.out.println("전화:"+st.getPhone());
			System.out.println("-----------------------");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		int sel;	//선택지
		while(true) {
			menu();
			sel = sc.nextInt();
			if(sel == 0) {
				break;
			}
			switch(sel) {
			case 1: insertStudent(list);break;
			case 2: searchStudent(list);break;
			case 3: deleteStudent(list);break;
			case 4: printAll(list);break;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
