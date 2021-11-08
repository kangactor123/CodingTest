package com.test.codingTest;

public class Prac10 {

	public static void main(String[] args) {
		int[] absol = {4,7,12};
		boolean[] signs = {true,false,true};
		
		System.out.println(solution(absol, signs));

	}
	
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		int temp = 0;
		
		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i] == false) {
				temp = absolutes[i];
				temp -= absolutes[i]*2;
				answer += temp;
			} else {
				answer += absolutes[i];
			}
		}
		return answer;
	}
}
