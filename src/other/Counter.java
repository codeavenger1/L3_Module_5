package other;

public class Counter {

	public int countSheeps(Boolean[] array1) {
		// TODO Auto-generated method stub
		int c = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != null) {

				if (array1[i] == true) {
					c++;
					System.out.println(array1);
				}
				System.out.println(array1[i]);

			}
		}
		return c;
	}

}
