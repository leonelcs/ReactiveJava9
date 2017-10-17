package demo.hof;

import java.util.function.Function;

public class ShowLength {
	public void show(int length) {
		System.out.println("length is:-" + length + " cm");
	}

	public static void main(String[] args) {
		ShowLength showLength = new ShowLength();
		showLength.show(100);

		System.out.println("now higher order function ");

		LengthConverter converter = new LengthConverter();
		show(100, converter::toMeter);
	}

	public static void show(int length, Function<Integer, String> converter) {
		System.out.println(" the length is " + converter.apply((length)));
	}
}
