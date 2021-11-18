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
			for (int j = 0; j < board.length; j++) {
				if (board[j][move] != 0) {
					temp = board[j][move];
					board[j][move] = 0;
					if (bucket.empty() != true && bucket.peek() == temp) {
						bucket.pop();
						count += 2;
					} else {
						bucket.push(temp);
					}
					break;
				}
			}
		}
		return count;
	}

}
