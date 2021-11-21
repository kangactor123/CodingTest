package com.test.codingTest;

public class Prac20 {

	public static void main(String[] args) {
		System.out.println(solution("1234"));
	}
	
	public static boolean solution(String s) {
		if (!(s.length() == 4 || s.length() == 6)) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (!((int)ch >= 48 && (int)ch <= 57)) {
				return false;
			}
		}
		return true;
	}

}
