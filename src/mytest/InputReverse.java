package mytest;

import java.util.Scanner;

public class InputReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력받은 문자열을 거꾸로 출력하라
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		// i가 문자열 str의 길이에서 -1을 해주는 이유는 문자열이 입력되면 0번째 부터 시작되기 때문.
		// i에 str의 문자열 길이가 저장된다.
		// i가 0보다 크거나 같을때 까지 반복된다.
		// i--를 통해 문자열의 길이 끝에서 부터 -1해준다.
		for(int i = str.length()-1; i >=0; i--) {
			System.out.print(str.charAt(i));
		}
		

	}

}
