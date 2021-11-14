package com.test.codingTest;

public class Prac13 {

	public static void main(String[] args) {
		String s = "For The Last Week";
		solution(s);

	}
	
	public static String solution(String s) {
		String[] arr = s.split(" ");
		StringBuilder temp = new StringBuilder("");
		
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			for (int j = 0; j < str.toCharArray().length; i++) {
				char ch = str.charAt(i);
				String s1 = ch + "";
				if (j == 0 & !((j >= 65 && j <= 90) && (j >= 97 && j <= 122))) {
					s1.toLowerCase();
					temp.append(s1);
				} else {
				}
				char[] carr = str.toCharArray();
				if ((carr[j] >= 65 && carr[j]<=90) || (carr[j] >= 97 && carr[j] <= 122)) {
					if (j == 0) {
						carr[j] = carr[j];
					}
				}
			}
		}
		
		return null;
	}

}
