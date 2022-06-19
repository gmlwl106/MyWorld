package com.javaex.ex01;

import java.util.Arrays;

/* 정수 내림차순으로 배치하기
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */

public class Ex12 {

	private static class Solution {
	    public long solution(long n) {
	    	String[] list = String.valueOf(n).split(""); //n을 문자열로 바꿔서 자릿수 하나하나 잘라서 list로 만듬
	        Arrays.sort(list); //배열변수를 이용해서 오름차순 정렬
	        //Arrays.sort(list, Collections.reverseOrder()); //내림차순

	        StringBuilder sb = new StringBuilder(); //문자열을 합치는 클래스 (그냥 합치는 것보다 속도가 빠르고 상대적으로 부하가 적다)
	        for (String aList : list) sb.append(aList);

	        return Long.parseLong(sb.reverse().toString()); //문자열을 뒤집어서 long형식으로 형변환
	    }
	}
}
