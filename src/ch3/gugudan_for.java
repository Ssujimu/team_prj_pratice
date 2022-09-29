package ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class gugudan_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//
//		int dan = sc.nextInt();
//
//		if(dan >= 1 && dan <=9) {
//			for(int i = 1; i <= 9; i++) {
//				System.out.println(dan+" "+ "*" +" "+ i + " = " +dan*i);
//			}
//		}

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int bdan = Integer.parseInt(br.readLine());

			for(int i = 1; i <= 9; i++) {
				bw.write(bdan+" "+"*"+" "+i+" = "+ bdan*i);
				bw.newLine();
			}
			
			
			
			br.close();
			bw.flush();
			bw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}
