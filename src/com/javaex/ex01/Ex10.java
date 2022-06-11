package com.javaex.ex01;

/* 제일 작은 수 제거하기
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 */

public class Ex10 {

	private static class Solution {
		public int[] solution(int[] arr) {
			
			if(arr.length == 1) {
				arr[0] = -1;
				return arr;
			}
			
			int[] answer = new int[arr.length-1];
			int minIndex = 0;
			
			//제일 작은 수의 인덱스를 찾아냄
			for(int i = 0; i<arr.length; i++) {
				if(arr[i]<arr[minIndex]) {
					minIndex=i;
				}
			}
			
			//제일 작은 수가 있는 위치를 덮어쓰우고 뒤에 있는것을 앞으로 정렬
			for(int i=minIndex+1; i<arr.length; i++) {
				arr[i-1] = arr[i];
			}
			
			//answer 배열로 새로 만듬 (arr 마지막 인덱스가 null이기 때문)
			for(int i=0; i<answer.length; i++) {
				answer[i] = arr[i];
				}
			
			return answer;
		}
	}
	
	public static void main(String[] args) {
		
		int[] arr = {4,3,2,1};
		
		Solution s = new Solution();
		
		int[] answer = s.solution(arr);
		
		for(int i=0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
		
	}
}
