package homeassignmentday6;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1, 2, 3, 4, 10, 6, 8};
		Arrays.sort(array);
		int count =9;
		int j =0;
	    for (int i = 0; i <= count; i++) {
		
		if (i==j)
			j++;
		System.out.println(j);

	}
	}

}
