package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

import objects.Student;

public class DemoStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("A", 1, 89));
		students.add(new Student("B", 12, 80));
		students.add(new Student("A1", 10, 67));
		students.add(new Student("C", 7, 56));
		students.add(new Student("A", 5, 90));
		
		Function<Student,String>fun_to_lower=
				student->student.getName().toLowerCase();
		
		Stream<Student> stream=students.stream();
		Consumer<String> consumer=System.out::println;
		stream.map(fun_to_lower).filter(name -> name.startsWith("a")).forEach(consumer);
	}

}
