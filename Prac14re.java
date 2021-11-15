package com.test.codingTest;

public class Prac14re {

	public static void main(String[] args) {
		String str = "one4seveneight";
		System.out.println("answer: "+solution(str));
		
	}
	
	public static int solution(String s) {
		String answer = "";
		String temp = "";
		String[] number = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (((int)ch >= 67 && (int)ch <= 90) || ((int)ch >= 97 && (int)ch <= 122)) {
				String str = ch + "";
				str.toLowerCase();
				temp += str;
				for (int j = 0; j < number.length; j++) {
					if (temp.equals(number[j])) {
						answer += j;
						temp = "";
					}
				}
			} else {
				answer += s.charAt(i);
			}
		}
		return Integer.parseInt(answer);
	}
}
