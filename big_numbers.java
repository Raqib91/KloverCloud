import java.util.Scanner;

public class BigNumbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();
		String out = "";
		int x, y, c = 0, tempSum = 0;

		int l1 = str1.length() - 1, l2 = str2.length() - 1;

		if (l1 > l2 || l1 == l2) {
			while (l1 >= 0) {
				x = Integer.parseInt(String.valueOf(str1.charAt(l1)));
				if (l2 >= 0)
					y = Integer.parseInt(String.valueOf(str2.charAt(l2)));
				else
					y = 0;
				tempSum = x + y + c;

				if (tempSum >= 10) {
					c = tempSum / 10;
					tempSum = tempSum % 10;
				} else
					c = 0;

				out += tempSum;

				l1--;
				l2--;
			}
		} else {
			while (l2 >= 0) {
				if (l1 >= 0)
					x = Integer.parseInt(String.valueOf(str1.charAt(l1)));
				else
					x = 0;

				y = Integer.parseInt(String.valueOf(str2.charAt(l2)));

				tempSum = x + y + c;

				if (tempSum >= 10) {
					c = tempSum / 10;
					tempSum = tempSum % 10;
				} else
					c = 0;

				out += tempSum;

				l1--;
				l2--;
			}
		}

		if (c != 0)
			out += c;

		StringBuilder sb = new StringBuilder(out);
		sb.reverse();
		System.out.println("Output: " + sb);

	}

}
