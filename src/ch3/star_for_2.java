package ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class star_for_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= num-i; j++) {
					bw.write(" ");
				}
				for(int k = 1; k <= i; k++) {
					bw.write("*");
				}
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
