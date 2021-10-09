package week1.day2;

public class PrintDuplicate {

	public static void main(String[] args) {
		int[] arr = { 45, 25, 13, 46, 15,45, 18, 13, 18, 19, 18, 17, 46 };
		int length = arr.length;
		for (int i = 0; i < length; i++) {
			int count = 0;
			for (int j = i + 1; j < length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
