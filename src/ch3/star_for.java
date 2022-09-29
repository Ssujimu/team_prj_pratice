package ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class star_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				for(int j = 1; j <= i; j++) {
					bw.write("*");
				}
				bw.newLine();
			}
			
			for(int i = 1; i<= num; i++) {
				bw.write("*");
			}
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
