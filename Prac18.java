package com.test.codingTest;

public class Prac18 {
	public static void main(String[] args) {
		System.out.println(solution(9));
		System.out.println(solution2(9));

	}

	public static String solution(int n) {
		StringBuilder builder = new StringBuilder();
		String[] arr = { "수", "박" };
		int idx = 0;

		for (int i = 0; i < n; i++) {
			builder.append(arr[idx]);
			if (idx == 1) {
				idx = 0;
				continue;
			}
			idx++;
		}
		return builder.toString();
	}
	
	public static String solution2(int n) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0 ; i < n; i++) {
			builder.append((i%2==0?"수":"박"));
		}
		return builder.toString();
	}

}
