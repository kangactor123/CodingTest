package com.test.codingTest;

public class Prac19 {
	public static void main(String[] args) {
		int[] number = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		System.out.println(solution(number, "right"));
	}
	public static String solution(int[] numbers, String hand) {
		StringBuilder builder = new StringBuilder();
		int left = 10, right = 12; //현재 위치
		
		for (int number : numbers) {
			if (number == 1 || number == 4 || number == 7) {
				builder.append("L");
				left = number;
				
			} else if (number == 3 || number == 6 || number == 9) {
				builder.append("R");
				right = number;
				
			} else {
				int distanceL = path(left, number);
				int distanceR = path(right, number);
				
				if (distanceL == distanceR) {
					if (hand.equals("right")) {
						builder.append("R");
						right = number;
					} else {
						builder.append("L");
						left = number;
					}
				} else if (distanceL > distanceR) {
					//왼손의 거리가 더 멀다는 것
					builder.append("R");
					right = number;
				} else if (distanceL < distanceR) {
					//오른손의 거리가 더 멀다.
					builder.append("L");
					left = number;
				}
			}
		}
		return builder.toString();
	}
	
	//좌표를 통해 거리를 구하는 메서드
	public static int path(int present, int number) {
		
		if (present == 0) {
			present = 11;
		}
		if (number == 0) {
			number = 11;
		}
		
		//현재 위치의 좌표 구하기
		int presentX = (present-1)/3;
		int presentY = (present-1)%3;
		
		//눌릴 숫자의 좌표구하기
		int numX = (number-1)/3;
		int numY = (number-1)%3;
		
		//현재 위치에서 눌릴 숫자까지의 좌표를 구해보자
		int res = Math.abs(presentX - numX) + Math.abs(presentY - numY);
		
		return res;
	}
}
