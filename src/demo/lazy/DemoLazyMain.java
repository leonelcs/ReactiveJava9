package demo.lazy;

import java.util.function.Supplier;

public class DemoLazyMain {

	public static String matchMe(boolean result1, boolean result2) {
		return result1 && result2 ? " both values are equal" : "values are different";
	}

	public static String matchMeLazy(Supplier<Boolean> length1, Supplier<Boolean> length2) {
		return length1.get() && length2.get() ? " both values are equal" : "values are different";
	}

	public static void main(String[] args) {

		String output = matchMe(DemoLazyFunction.evaluateMe("one"), DemoLazyFunction.evaluateMe("three"));
		System.out.println(output);
		System.out.println("now lazy - fail second");
		String output2 = matchMeLazy(() -> DemoLazyFunction.evaluateMe("one123"), () -> DemoLazyFunction.evaluateMe("three"));
		System.out.println(output2);
		System.out.println("now lazy - fail first");
		String output3 = matchMeLazy(() -> DemoLazyFunction.evaluateMe("one"), () -> DemoLazyFunction.evaluateMe("three"));
		System.out.println(output3);
		
	}

}
