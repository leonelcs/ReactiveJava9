package demo.functioncomposition;

import java.util.function.Function;

public class DemoFunction_composition_Basic {
	public static void main(String[] args) {
		Function<Integer, Integer> add = number -> number + 2;
		Function<Integer, Integer> square = number -> number * number;
		Integer value_add = add.apply(5);
		Integer value_square = square.apply(5);
		System.out.println("addition:- " + value_add + "\tsquare:- " + value_square);

		// andThen sums before square
		Integer result_composition = add.andThen(square).apply(5);
		System.out.println("value of square after addition:- " + result_composition);
		//compose square before add
		Integer result_composition1=add.compose(square).apply(5);
		System.out.println("value of addition after squaring:- " +
		result_composition1);
	}
}
