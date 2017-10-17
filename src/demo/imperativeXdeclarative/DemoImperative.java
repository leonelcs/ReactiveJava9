package demo.imperativeXdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DemoImperative {
	public static void main(String[] args) {
		// DemoImperative demo = new DemoImperative();
		// List<String> names = new ArrayList<>();
		// names.add("apple");
		// names.add("grapes");
		// names.add("apple");
		// names.add("mango");
		// names.add("chickoo");
		// names.add("strawberry");
		// int count = demo.matchCountDeclarative(names, "apple");
		// System.out.println("the counter is:- " + count);

		System.out.println(frequencyString("Quantas palavras bosta tem nessa bosta", "bosta"));
	}

	public int matchCount(List<String> names_input, String name) {
		int count = 0;
		for (String n : names_input) {
			if (n.equals(name)) {
				count++;
			}
		}
		return count;
	}

	public int matchCountDeclarative(List<String> names_input, String name) {
		return Collections.frequency(names_input, name);
	}

	public static int frequencyString(String frase, String palavra) {
		return Collections.frequency(Arrays.asList(frase.split(" ")), palavra);
	}

	public int matchCountNew(List<String> names_input, String name) {
		long count = names_input.stream().filter(n -> n.equals(name)).count();
		return (int) count;
	}
}
