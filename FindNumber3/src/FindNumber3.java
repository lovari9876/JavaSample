import java.util.Scanner;

public class FindNumber3 {

	// number 123
	// 자릿수를 알수 없는 큰 숫자에서 숫자 하나하나를 다룰때 알아야 하는 코드.
	public static int find369(int number) {
		int count = 0;
		while (number > 0) {
			int temp = number % 10;
			if (temp == 3 || temp == 6 || temp == 9)
				count++;
			number /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		for (Integer i = 1; i <= 100; i++) {
			int count = find369(i);
			System.out.format("%d :", i);
			for (int j = 0; j < count; j++) {
				System.out.print("짝");
			}
			System.out.println("");
		/*
			if (i.toString().indexOf('3') < 0)
				continue;

			System.out.format("%d\n", i);
		 	if (i.toString().indexOf('3') >= 0) {
				System.out.format("%d\n", i);
		 	}
		 */
		}
	}
}
