package 연습장;

public class Wow_369 {
    public static void main(String[] args) {
    	
        for (int i = 1; i <= 100; i++) {
            String number = String.valueOf(i);
            int count369 = 0;
            for (int j = 0; j < number.length(); j++) {
                char digit = number.charAt(j);
                if (digit == '3' || digit == '6' || digit == '9') {
                    count369++;
                }
            }
            
            if (count369 == 1) {
                System.out.print("* ");
            } 
            else if (count369 == 2) {
                System.out.print("** ");
            } 
            else {
                System.out.print(i + " ");
            }

            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}

