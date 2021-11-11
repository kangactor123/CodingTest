package com.test.codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Prac11 {

	public static void main(String[] args) {
		int[] numbers = {5,8,4,0,6,7,9};
		System.out.println(solution2(numbers));

	}
	
	public static int solution(int[] numbers) {
		int answer = 0;
		int temp = 0;
		Arrays.sort(numbers);
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
		
		for (int i : list) {
			System.out.println(i);
		}
		System.out.println("연산");
		for (int i = 0; i < list.size(); i++) {
			if (!list.contains(i)) {
				System.out.println(i);
				answer+=i;
			}
			temp = list.get(i);
		}
		System.out.println(temp);
		if (temp != 9) {
			for (int i = temp+1; i <= 9; i++) {
				answer +=i;
			}
		}
		
		return answer;
	}
	
	public static int solution2(int[] numbers) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			if(i < numbers.length) {
				list.add(numbers[i]);
			} else {
				list.add(0);
			}
		}
		
		for (int i : list) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			if (!list.contains(i)) {
				answer += i;
			}
		}
		
		return answer;
		

	}

}
