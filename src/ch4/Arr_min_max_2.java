package ch4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Arr_min_max_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// 최대 최소 배열로 뽑아보자
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 몇 개의 수를 비교 할 건지
		int num = Integer.parseInt(br.readLine());
		// 띄어쓰기를 기준으로 잘라줌
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		// 배열에 수의 갯수만큼 저장
		int[] arr = new int[num];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// sort를 사용해 배열을 정렬 -> 배열에 저장된 값을 오름차순으로 정렬해준다 작은 값부터~큰 값순
		Arrays.sort(arr);
		bw.write(arr[0] + " " + arr[num - 1]);
		
		// 내림차순
//		Integer[] reverarr = new Integer[num];
//		
//		for(int i = 0; i < reverarr.length; i++) {
//			reverarr[i] = Integer.parseInt(st.nextToken());
//		}
//		
//		Arrays.sort(reverarr, Collections.reverseOrder());
//		bw.write(reverarr[0] + " " + reverarr[num - 1]);
		
		br.close();
		bw.flush();
		bw.close();

	}

}
