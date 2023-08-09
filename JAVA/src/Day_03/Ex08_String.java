package Day_03;

public class Ex08_String {

	public static void main(String[] args) {

		//String은 참조자료형
		String a = "hello";
		String b = "java";
		String c = "hello";
		String d = new String("hello");
		String e = new String("hello");
		String f = new String("hello");
		
		System.out.println(a == c);
		System.out.println(a == d);
		System.out.println(a.equals(d));

		System.out.println(e == f);
		System.out.println(e.equals(f));
		
		
		
		// ==       : 해당 변수의 레퍼런스 (참조정보)를 비교
		// equals() : 해당 변수의 문자열 자체를 비교 --> 문자열을 비교할 때
		
		
	}

}
