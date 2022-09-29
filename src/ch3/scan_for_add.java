package ch3;

import java.util.Scanner;

public class scan_for_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int testNum = sc.nextInt();
		
		
		for(int i = 1; i <= testNum; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}

	}

}
