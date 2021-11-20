package com.test.codingTest;

public class Prac17 {

	public static void main(String[] args) {
		System.out.println(solution("Pyy"));

	}
	
	public static boolean solution(String s) {
		int p = 0, y = 0;
		
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p') {
				p++;
			} else if (s.charAt(i) == 'y') {
				y++;
			}
		}
		return p == y ? true : false;
	}

}
