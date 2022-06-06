package com.javaex.ex01;

import java.util.Scanner;

/* 최대공약수와 최소공배수
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 */

public class Ex08 {

	private static class Solution {
	    public int[] solution(int a, int b) {
	        int[] answer = new int[2];
	        
	        answer[0] = GCD(a, b);
	        answer[1] = LCM(a, b);
	        
	        return answer;
	    }
	    
	    public int GCD(int a, int b) {
	    	if(b == 0) return a;
	    	else return GCD(b, a%b);
	    }
	    
	    public int LCM(int a, int b) {
	    	return a * b / GCD(a, b);
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a:");
		int a = sc.nextInt();
		
		System.out.print("b:");
		int b = sc.nextInt();
		
		Solution s = new Solution();
		int[] ab = s.solution(a, b);
		
		System.out.println("최대공약수:"+ab[0]);
		System.out.println("최소공배수:"+ab[1]);
	}
}
