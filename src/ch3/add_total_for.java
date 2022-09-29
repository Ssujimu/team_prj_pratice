package ch3;

import java.util.Scanner;

public class add_total_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int rs = 0;
		
		if(num >= 1 && num <= 10000) {
			for(int i = 1; i <= num; i++) {
				rs = rs + i;
			}
			System.out.println(rs);
		}

	}

}
