package com.test.codingTest;

import java.util.ArrayList;
import java.util.List;

public class Prac16 {

	public static void main(String[] args) {
		String new_id = "123_.def";
		String new_id2 = "abcdefghijklmn.p";
		String new_id3 = "...!@BaT#*..y.abcdefghijklm";
		String new_id4 = "................b.........";
		String new_id5 = "z-+.^.";
		String new_id6 = "=.=";
		System.out.println("최종 리턴 : " + solution(new_id6));

	}

	public static String solution(String new_id) {
		String answer = "";
		answer = new_id.toLowerCase();
		answer = second(answer);
		answer = third(answer);
		answer = fourth(answer);
		
		if (answer.length() == 0 || answer.trim().equals("")) {
			answer = "a";
		}
		if (answer.length() >= 16) {
			answer = sixth(answer);
		}
		if (answer.length() <= 2) {
			answer = seventh(answer);
		}
		return answer;
	}

	// 2단계 유효 문자인지 체크
	public static String second(String new_id) {
		List<Character> list = new ArrayList<Character>();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			int temp = 97 + i;
			list.add((char) temp);
		}
		for (int i = 0; i < 10; i++) {
			int temp = 48 + i;
			list.add((char) temp);
		}
		list.add((char) 45);
		list.add((char) 46);
		list.add((char) 95);

		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if (list.contains(ch)) {
				builder.append(ch);
			}
		}
		return builder.toString();
	}

	// 3단계 : 마침표가 연속되면 하나로 바꾼다.
	public static String third(String answer) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < answer.length() - 1; i++) {
			char ch = answer.charAt(i);
			char ch2 = answer.charAt(i + 1);
			if (ch == '.' && ch2 == '.') {
				continue;
			} else {
				builder.append(ch);
			}
		}
		if (answer.charAt(answer.length() - 1) != '.') {
			builder.append(answer.charAt(answer.length() - 1));
		}
		return builder.toString();
	}

	// 4단계 : 마침표가 처음이나 끝에 위치하면 제거 =.=
	public static String fourth(String answer) {
		if (answer.length() < 1) {
			return answer;
		}
		if (answer.charAt(0) == '.') {
			answer = answer.substring(1, answer.length());
		}
		if (answer.length() > 2) {
			if (answer.charAt(answer.length() - 1) == '.') {
				answer = answer.substring(0, answer.length() - 1);
			}
		}
		return answer;
	}

	// 6단계 : 16자 이상이면 15개 남겨놓고 다 제거, 만약 제거 후 끝에 .이라면 마지막 . 제거
	public static String sixth(String answer) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 15; i++) {
			if (i == 14 && answer.charAt(i) == '.') {
				break;
			} else {
				builder.append(answer.charAt(i));
			}
		}
		return builder.toString();
	}

	// 7단계 : 길이가 2자 이하라면 마지막 문자로 덧붙임
	public static String seventh(String answer) {
		StringBuilder builder = new StringBuilder();
		for (int i = answer.length(); i < 3; i++) {
			answer += answer.charAt(answer.length() - 1);
		}
		return answer;
	}
}
