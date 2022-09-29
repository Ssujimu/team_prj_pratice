package ch3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class testcase_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			// 두 정수를 입력받고 합을 출력함
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st;

			int num = Integer.parseInt(br.readLine());

			for(int i = 1; i <= num; i++) {
				st = new StringTokenizer(br.readLine());
				// 이게 두 정수를 합해주고 출력해준다.
				bw.write("Case #"+i+": "+(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +"\n");
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

