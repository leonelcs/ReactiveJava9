package demo;
import java.util.Arrays;
import java.util.List;

import helpers.DisplayData;

public class DemoMethodRef {

	public static void display(List<String> fruits, DisplayData displayData) {
		for (String item : fruits)
			System.out.println(displayData.write("data:-" + item, item));
	}

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("apple", "mango", "Lichi", "Strawberry");
		display(fruits, String::format);
	}

}
