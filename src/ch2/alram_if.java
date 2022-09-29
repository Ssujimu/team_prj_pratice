package ch2;

import java.util.Scanner;

public class alram_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int hour, minute;
		hour = sc.nextInt();
		minute = sc.nextInt();
		
		if(minute < 45) {
			hour --;
			minute = 60 - (45 - minute);
			if(hour < 0) {
				hour = 23;
			}
			System.out.println(hour+" "+minute);
		} else {
			System.out.println(hour+" "+(minute - 45));
		}

	}

}
