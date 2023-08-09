package Day_03;

public class Ex04_foreach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		for (int i = 0 ; i < week.length ; i++) {
			System.out.print(week[i] + " ");
			
		}
		System.out.println();
		
		
		// foreach문은
		// - 배열의 모든 요소를 반복한다.
		for (String day : week) {
			System.out.print(day +" ");   //day : week[i]
		}
		System.out.println();
}
}