package chap1;

public class charExample {

	public static void main(String[] args) {
		char c1 = 'A'; //char 문자형, 한 문자만 기억, 작은 따옴표로 묶는다.
		char c2 = 65; //문자형 변수에 10진수값 65기억
		char c3 = '\u0041'; //유니코드값 16진수로 저장
		
		char c4 = '가';
		char c5 = 44032;
		char c6 = '\uac00';
		
		char c7 = 'a';
		char c8 = 97;
		int c9 = c7 + 1;
		char c10 = 'a' + 1;
		char c11 = 'A' + 1;
//		char c11 = c7 + 1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		System.out.println(c10);
		System.out.println(c11);;
	}

}
