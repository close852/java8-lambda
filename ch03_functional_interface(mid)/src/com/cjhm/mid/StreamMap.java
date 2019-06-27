package com.cjhm.mid;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMap {
	
	public static void streamToMap() {
		Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT");
		Stream<Integer> iStream = stream.filter(s->s.startsWith("J")).map(s->s.length());
		printStream(iStream);
	}
	
	public static void arrayToFlatMap() {
		String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
		Stream<String> stream = Arrays.stream(arr);

		Stream<String> flatStream = stream.flatMap(s -> Stream.of(s.split(" ")));
		printStringStream(flatStream);
	}
	
	
	private static void printStringStream(Stream<String> iStream) {
		System.out.println(iStream.collect(Collectors.joining(", ")));
	}

	private static <T> void printStream(Stream<T> iStream) {
		iStream.forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

	private static void printStream(IntStream iStream) {
		iStream.forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

}
