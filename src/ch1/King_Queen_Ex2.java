package ch1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class King_Queen_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {

			// 배열로 푸는 법
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			// 필요한 전체 말 기준
			int[] total_horse = new int[] {1, 1, 2, 2, 2, 8};
			
			for(int i = 0; i < total_horse.length; i++) {
				// 내가 가지고 있는 말 갯수
				int horse = Integer.parseInt(st.nextToken());
				// 필요한 말 갯수 출력
				bw.write(total_horse[i] - horse + " ");
			}
			
			br.close();
			bw.flush();
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
