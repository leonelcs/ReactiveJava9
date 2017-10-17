package helpers;

public class Processors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Number of Processors: " + Runtime.getRuntime().availableProcessors());
		System.out.println("Free Memory: " + Runtime.getRuntime().freeMemory());
		System.out.println("Total Memory: " + Runtime.getRuntime().totalMemory());
		System.out.println("Max Memory: " + Runtime.getRuntime().maxMemory());

	}

}
