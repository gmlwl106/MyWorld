package com.javaex.ex01;

public class Ex18 {
	
	class Solution {
		public int solution(int n) {
			int answer = 0;
			
			for(int i=0; i<=n; i++) {
				if(n%i == 0) {
					answer += i;
				}
			}
			
			return answer;
		}
	}
}
