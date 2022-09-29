package ch3;

import java.util.Scanner;

public class costco_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int total_price = sc.nextInt();
		int buyItem = sc.nextInt();
		int oneItem;
		int num;
		int price = 0;

		for(int i = 1; i <= buyItem; i++) {
			if(total_price >= 1 && total_price <= 1000000000 && buyItem >= 1 && buyItem <= 100) {
				oneItem = sc.nextInt();
				num = sc.nextInt();
				if(oneItem >= 1 && oneItem <= 1000000 && num >= 1 && num <= 10) {
					oneItem = oneItem * num;
					price = price + oneItem;
				}
			}
		}
		
		if(price == total_price) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
