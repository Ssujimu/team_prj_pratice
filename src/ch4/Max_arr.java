package ch4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Max_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 9개의 자연수 중 최대값과 몇 번째인지 찾기
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int[] num = new int[9];
			
			for(int i = 0; i < num.length; i++) {
				num[i] = Integer.parseInt(br.readLine());
			}
			
			// 최대값을 찾기위한 용도
			int max = 0;
			
			// 최소값이 몇 번째인지 알기위해	
			int cnt = 0;
			// 최대값이 정해 질 때 마다 index 값이 바뀜
			int index = 0;
			
			
			// 
			for(int value : num) {
				cnt++;	// 숫자가 돌 때마다 cnt++로 몇 번째 인지 알 수 있음
				if(value > max) {
					max = value;
					index = cnt;	
					// 0인 index에 cnt값을 넣음으로 몇 번째인지 지정해줌 index를 안하고 했을 시 cnt만 ++되어서 9번 돌기 때문에 cnt는 무조건 9가 나옴
				}
			}
			
			bw.write(max + " " + index);
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
