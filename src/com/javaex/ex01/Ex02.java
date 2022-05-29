package com.javaex.ex01;

import java.util.Scanner;

public class Ex02 {

	/*
	 * x만큼 간격이 있는 n개의 숫자
	 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
	 */
	
	private static class Solution {
	    public long[] solution(int x, int n) {
	        long[] answer = new long[n];
	        
	        for(int i=1; i<=n; i++) {
	        	answer[i-1] = x * i;
	        }
	        
	        return answer;
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		Solution s = new Solution();
		long[] answer = s.solution(x, n);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
