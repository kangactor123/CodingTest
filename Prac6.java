package com.test.codingTest;

import java.util.ArrayList;

public class Prac6 {

	public static void main(String[] args) {
		int[] answers = {2,1,1,3,1,2,2,2,1,4,4,2,5,1,1,2,3,1,2};
		int[] iarr = solution(answers);
		
		for (int i : iarr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] solution(int[] answers) {
		int[] iarr = new int[answers.length];
		int[] first = {1,2,3,4,5};
		int[] second = {2,1,2,3,2,4,2,5};
		int[] third = {3,3,1,1,2,2,4,4,5,5};
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		
		first = makeArr(first, iarr);
		second = makeArr(second, iarr);
		third = makeArr(third, iarr);
		
		for (int i = 0; i < answers.length; i++) {
			if (first[i] == answers[i]) {
				count++;
			}
			if (i == answers.length - 1) {
				list.add(count);
				count = 0;
			}
		}
		for (int i = 0; i < answers.length; i++) {
			if (second[i] == answers[i]) {
				count++;
			}
			if (i == answers.length - 1) {
				list.add(count);
				count = 0;
			}
		}
		for (int i = 0; i < answers.length; i++) {
			if (third[i] == answers[i]) {
				count++;
			}
			if (i == answers.length - 1) {
				list.add(count);
				count = 0;
			}
		}
		ArrayList<Integer> res = new ArrayList<>();
		res.add(1);
		iarr = new int[3];
		int max = list.get(0);
		for (int i = 1; i < iarr.length; i++) {
			if (list.get(i) > max) {
				max = list.get(i);
				res.set(0,i+1);
			} else if (list.get(i)==max) {
				res.add(i+1);
			}
		}
		int[] result = new int[res.size()];
		for (int i = 0; i < res.size(); i++) {
			result[i] = res.get(i);
		}
		return result;
	}
	
	public static int[] makeArr(int[] student, int[] answers) {
		int[] iarr = new int[answers.length];
		for (int i = 0, j = 0; i < answers.length; i++, j++) {
			if (j != student.length) {
				iarr[i] = student[j];
			} else if (j == student.length) {
				j = 0;
				iarr[i] = student[j];
			}
		}
		return iarr;
	}
}