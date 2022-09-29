package ch4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Arr_min_max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 최대 최소 뽑는 문제
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int min = 1000001;
			int max = -1000001;

			while(st.hasMoreTokens()) {
				int val = Integer.parseInt(st.nextToken());
				if(val > max) {
					max = val;
				}
				if(val < min) {
					min = val;
				}
			}

			System.out.println(min +" "+ max);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
