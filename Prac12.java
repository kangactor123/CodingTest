package com.test.codingTest;

import java.util.HashSet;

public class Prac12 {

	public static void main(String[] args) {
		int[] lottos = {45, 4, 35, 20, 3, 9};
		int[] win_nums = {20, 9, 3, 45, 4, 35};
		int[] answer = solution(lottos, win_nums);
		
		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] solution(int[] lottos, int[] win_nums) {
		int zero = 0; //0의 갯수
		int count = 0; //정답 갯수
		int[] answer = new int[2];
		HashSet<Integer> set = new HashSet<>();
		
		for (int i : win_nums) {
			set.add(i);
		}
		
		//정답 갯수 확인
		for (int i : lottos) {
			if (set.contains(i)) {
				count++;
			}
		}
		
		//zero갯수 확인
		for (int i = 0; i < lottos.length; i++) {
			if (lottos[i] == 0) {
				zero++;
			}
		}
		
		//최고 순위 구하기
		switch(zero+count) {
			case 6 : answer[0] = 1; break;
			case 5 : answer[0] = 2; break;
			case 4 : answer[0] = 3; break;
			case 3 : answer[0] = 4; break;
			case 2 : answer[0] = 5;	break;
			default : answer[0] = 6; answer[1] = 6; return answer;
		}
		
		//최소 순위 구하기 count 에 따라서 구하면 되는거 아닌가?
		answer[1] = min(count);
		return answer;
	}
	
	public static int min(int count) {
		switch (count) {
			case 6 : return 1;
			case 5 : return 2;
			case 4 : return 3;
			case 3 : return 4;
			case 2 : return 5;
			default: return 6;
		}
	}
}
