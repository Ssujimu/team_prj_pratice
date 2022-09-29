package mytest;

import java.util.Arrays;
import java.util.List;

public class Test_1 {
	
	// 문자열 1~100
	String [] args = new String[100];
	
	private int [] getIntArray(String[] inputStringArray) {
		
		// 문자열 1~100 출력
		for(int i = 0; i < 100; i++) {
			args[i] = Integer.toString(i+1);
		}
		
		// 뽑히나 확인
//		for(String str:args) {
//			System.out.println("문자열 : " + str);
//		}
		
		int [] results = new int[100];
		
		// results에 args 해당 숫자
		for(int i = 0; i < results.length; i++) {
			results[i] = Integer.parseInt(args[i]);
			System.out.println("results : " + results[i]);
		}
		
		return results;
	}
	
	public void codingtest() {
		int [] results = getIntArray(args);
		List<int[]> intList = Arrays.asList(results);
		int sum = 0;
//		intList.forEach(x -> sum+=x);
		
		System.out.println("sum : " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test_1 t = new Test_1();
		t.codingtest();
		
	}

}
