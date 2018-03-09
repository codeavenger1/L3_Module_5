
public class Kata {

	public static Boolean betterThanAverage(int[] classPoints, int yourPoints) {
		// TODO Auto-generated method stub
		int average = 0;
		int sum = 0;
		for (int i = 0; i < classPoints.length; i++) {
			System.out.println(classPoints[i]);
			sum+=classPoints[i];
			
			//if (classPoints[i]<yourPoints) {
			//	return true;
			//}
		}
		return true;
	}

}
