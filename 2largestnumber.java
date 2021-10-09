package week1.day2;

import java.util.Arrays;

public class Learnarray {

	public static void main(String[] args) {

		int[] numArr = {100,49,398,34,1,267};
		int length = numArr.length;
		System.out.println("length of the array\n");
          for (int i = 0; i < numArr.length; i++) {
			
			System.out.println(numArr[i]);
		}
		Arrays.sort(numArr);
		System.out.println("sorted Output");
		
		for (int i = 0; i < numArr.length; i++) {
			
			System.out.println(numArr[i]);
		}
		System.out.println("secound largest number is " + numArr[length-2]);
		System.out.println("secound smallest number" + numArr[1]);
		}
		
	}

