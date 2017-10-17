package demo.lazy;

public class DemoLazyFunction {
	public static boolean evaluateMe(String data) {
		System.out.println("evaluation");
		return data.length() > 5;
	}
}
