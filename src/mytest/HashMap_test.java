package mytest;

import java.util.HashMap;

public class HashMap_test {
	
	public static void main(String[] args) {

		int [] nums = {22,4,56,7,8,90,12,3,45,6,22,31,45,63,86,57};

		HashMap map = new HashMap();

		for (int i = 0; i < nums.length; i++) {	// nums 길이 만큼 반복
			// int cnt = 1;
			for (int j = 2; j <= nums[i]; j++) {	// nums에 있는 값. 자기자신 1빼고 2부터
				int cnt = 1;
				if(nums[i]%j==0) {	// 나누어 떨어질때
					if(map.containsKey(j)) {	// j와 같은 값이 있다면
						cnt += (int)map.get(j);	// cnt + (int)map.get(string) get으로 입력받은 j에 cnt+
					}
					map.put(j, cnt);	// 넣다..j랑 cnt..map에..
				}

			}

		}

		for (Object oo : map.entrySet()) {	// map에 있는 값 전부 출력
			System.out.println(oo);
		}

	}
}
