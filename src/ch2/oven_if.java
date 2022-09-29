package ch2;

import java.util.Scanner;


public class oven_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hour, minute, making;
		
		hour = sc.nextInt();
		minute = sc.nextInt();
		making = sc.nextInt();
		
		hour = hour + making / 60;
		minute = minute + making % 60;
		
		
		if(minute >= 60) {
			hour = hour + 1;
			minute = minute - 60;
		}
		if(hour >= 24) {
			hour = hour - 24;
		}
		
		System.out.println(hour+" "+minute);

	}

}
