package com.test.codingTest;

import java.util.Arrays;

public class Prac8 {

	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};
		int[] result = solution(array, commands);
		
		for (int i : result) {
			System.out.print(i + " ");
		}

	}
	
	public static int[] solution(int[] array, int[][] command) {
		int[] answer = new int[command.length];
		
		for (int i = 0; i < command.length; i++) {
			int[] temp = solution(array, command[i][0], command[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[command[i][2] - 1];
		}
		return answer;
	}
	
	public static int[] solution(int[] array, int i, int j) {
		int[] result = new int[j-i+1];
		
		for (int k = 0; k < result.length; k++, i++) {
			result[k] = array[i-1];
		}
		return result;
	}

}
