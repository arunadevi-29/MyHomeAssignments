package homeassignmentday6;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 3, 2, 11, 4, 6, 7 };

		System.out.println("From the last to second number is:");

		for (int i = 0; i < array.length; i++) {

			if (array[i] == array[array.length - 2]) {
				System.out.println(array[i]);
			}

		}
	}

}
