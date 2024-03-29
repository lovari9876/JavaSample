import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) throws Exception {
        /**
         * 1부터 100사이의 정수중에 Prime Number(소수)를 구하시오.
         * 소수는 0과 1을 제외한 오로지 자기 자신만으로 나뉘어 지는 수.
         * 어떤수 n이 다른 소수로 나뉘어 지지 않는 다면 소수다.
         */
        int[] numbers = new int[100];
        int count = 0;
        boolean isPrime;

        for (int n = 2; n <= 100; n++) {
            isPrime = true;
            for (int i = 0; i < count; i++) {
                if (n % numbers[i] == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                numbers[count] = n;
                count++;
            }
        }

        /*
        for (int i = 1; i <= 100; i++) {
            System.out.format("%d : %s\n", i, (i % 2 == 0 ? "짝수" : "홀수"));
        }
        */

        for (int i = 0; i < count; i++) {
            System.out.format("%d is a prime number\n", numbers[i]);
        }
    }
}
