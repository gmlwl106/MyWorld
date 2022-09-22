package com.javaex.ex01;


/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 */

public class Ex17 {

	class Solution {
		public int[] solution(long n) {
			int[] answer = {};
			int k = 0;
			long num = n;
			
			while(n>0) {
				k++;
				n = n/10;
			}
			
			answer = new int[k];
			
			for(int i=0; i<k; i++) {
				answer[i] = (int)(num%10);
				num = num/10;
			}
			
			return answer;
		}
	}
}
