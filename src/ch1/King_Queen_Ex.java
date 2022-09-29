package ch1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class King_Queen_Ex{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int king = 1;
			int queen = 1;
			int rook = 2;
			int bishop = 2;
			int night = 2;
			int pawn = 8;
			
			
			king = king - Integer.parseInt(st.nextToken());
			queen = queen - Integer.parseInt(st.nextToken());
			rook = rook - Integer.parseInt(st.nextToken());
			bishop = bishop - Integer.parseInt(st.nextToken());
			night = night - Integer.parseInt(st.nextToken());
			pawn = pawn - Integer.parseInt(st.nextToken());
			
			bw.write(king + " " + queen + " " + rook + " " + bishop + " " + night + " " + pawn);
			
			br.close();
			bw.flush();
			bw.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
