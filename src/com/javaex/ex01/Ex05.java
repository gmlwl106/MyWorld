package com.javaex.ex01;

import java.util.Scanner;

public class Ex05 {

	/* 하샤드 수
	 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
	 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
	 */
	
	private static class Solution {
	    public boolean solution(int x) {
	    	int sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
	    	//x를 String으로 변환(String.valueOf(x))
	    	//String x를 char로 변환 (chars())
	    	//char x를 map에 저장해서 전부 합함 (sum())
	        return x % sum == 0;
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		Solution s = new Solution();
		if(s.solution(x) == true) {
			System.out.println("["+x+"는 하샤드 수입니다.]");
		} else {
			System.out.println("["+x+"는 하샤드 수가 아닙니다.]");
		}
	}

}
