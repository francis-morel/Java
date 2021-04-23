package ex6;

import java.util.ArrayList;
import java.util.Random;

public class C06B_Exercice6 {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Random rand = new Random();
		
		final int VAL_MIN = -95;
		final int VAL_MAX = 5;
		
		while (true) {
			int val = rand.nextInt(VAL_MAX+1 - VAL_MIN) + VAL_MIN;
			if (val >= 0) break;
			
			arr.add((Integer)val);
		}
		
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
	}

}
