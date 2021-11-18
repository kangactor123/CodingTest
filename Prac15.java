package com.test.codingTest;

import java.util.Stack;

public class Prac15 {

	public static void main(String[] args) {
		int[][] board = {
				{0,0,0,0,0},
				{0,0,1,0,3},
				{0,2,5,0,1},
				{4,2,4,4,2},
				{3,5,1,3,1}
		};
		int[] moves = {1,5,3,5,1,2,1,4};
		System.out.println("answer : " + solution(board, moves));

	}
	
	public static int solution(int[][] board, int[] moves) {
		int count = 0;
		int temp = 0;
		Stack<Integer> bucket = new Stack<>();
		
		for (int i = 0; i < moves.length; i++) {
			int move = moves[i] - 1;
//			System.out.println("move : " + move);
			for (int j = 0; j < board.length; j++) {
				if (board[j][move] != 0) {
					temp = board[j][move];
					System.out.println("j : " + j);
					System.out.println("temp:"+temp);
					board[j][move] = 0;
//					System.out.println("temp : " + temp);
					if (bucket.empty() != true && bucket.peek() == temp) {
//						System.out.println("bucket.peek() : " + bucket.peek());
						bucket.pop();
						count += 2;
//						bucket.push(temp);
					} else {
						bucket.push(temp);
					}
					break;
				}
			}
		}
//		for (int i = 0; i < bucket.size(); i++) {
//			System.out.println(bucket.pop());
//		}
		
		return count;
	}

}
