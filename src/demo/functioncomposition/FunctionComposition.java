package demo.functioncomposition;

public class FunctionComposition {

	// using only on function to calculate the average
	// public double calculateAverage(int x, int y) {
	// return ((x + y) / 2.0);
	// }

	public static int addMe(int x, int y) {
		return x + y;
	}

	public static double calculateAverage(int x, int y) {
		return addMe(x, y) / 2.0;
	}

	public static double calculateAverage(int res) {
		return res / 2.0;
	}
	
	public static void main(String[] args) {
		System.out.println(calculateAverage(addMe(10, 20)));
	}
	

}
