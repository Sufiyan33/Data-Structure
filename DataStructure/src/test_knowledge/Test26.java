package test_knowledge;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test26 {

	public static void main(String[] args) {
		String str = "I am a fullStack developer";

		Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().forEach(System.out::println);
	}
}
