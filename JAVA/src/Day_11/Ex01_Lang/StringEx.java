package Day_11.Ex01_Lang;

public class StringEx {

	public static void main(String[] args) {
		String str1 = " TheJoEun Academy";
		String str2 = " theJoEun Academy";
		
		System.out.println(str1.charAt(2)); 			// index에 있는 문자 추출
		System.out.println(str1.concat(str2)); 			// str1 + str2 문자열 열결
		System.out.println(str1.contains("Academy"));	// 문자열 포함 여부 확인 (true, false)
		System.out.println(str1.equals(str2)); 			// 문자열 일치 여부 확인 (true, false)
		System.out.println(str1.equalsIgnoreCase(str2));// 대소문자 구분없이 문자열 일치 여부 확인 (true/false)
		System.out.println(str1.indexOf("A"));  		// 해당 문자의 첫 index반환, 없으면 -1
		System.out.println(str1.lastIndexOf("e")); 		// 해당 문자의 마지막 index반환, 없으면 -1
		System.out.println(str1.trim()); 				// 문자열 양쪽 공백 제거
		System.out.println(str1.length());  			// 문자열의 길이 (글자수)[공백 포함]
		System.out.println(str1.substring(10)); 		// index 앞의 문자열을 자르고, 위의 문자열을 반환
		System.out.println(str1.substring(10, 17));		//index=(index2-1)까지 반환
		
		System.out.println(str1.replace(" ","*"));		// replace ("기존문자", "대체문자")
		System.out.println(str1.replaceAll(" ", "*"));	// replace 와 같음
		System.out.println(str1.toUpperCase());			// 모두 대문자로 변경
		System.out.println(str1.toLowerCase());			// 모두 소문자로 변경
		
		// split("구분자")
		String[] sp = str1.split("");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(i + " : \t" + sp[i]);
		}
		
		String cal = "10+20";
		String[] num = cal.split("\\+");
			// + 플러스를 바로 작성하면 오류가 발생한다. 
			// + 는 많은 의미를 내포하고 있기 때문에 정규표현식 + 기호만을 구분하기 위해서
		  	// 앞에 //를 붙여줘야한다. 다음과 같이 --> \\+
		System.out.println("피연산자1 : " + num[0]);
		System.out.println("피연산자2 : " + num[1]);
	}
}
