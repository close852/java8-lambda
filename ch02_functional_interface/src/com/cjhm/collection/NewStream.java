package com.cjhm.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.cjhm.Entity.User;

public class NewStream {
	public static void collectionNumberToSteram() {
		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5);

		Stream<Integer> iStream = iList.stream();
		printStream(iStream);
	}

	public static void collectionObjectToSteram() {
		List<User> userList = new ArrayList<User>();

		userList.add(new User("jiwoo", 29));
		userList.add(new User("mira", 28));
		userList.add(new User("john", 16));
		Stream<User> userStream = userList.stream();

		printStream(userStream);
	}

	public static void collectionStringToSteram() {
		List<String> sList = Arrays.asList("Hello", "World", "Bizwell");
		Stream<String> stringStream = sList.stream();

		printStringStream(stringStream);

	}

	public static void arrayToStream() {
		String[] sArr = new String[] { "넷", "셋", "둘", "하나" };

		Stream<String> stream = Arrays.stream(sArr);
		printStream(stream);

		// 특정부분만 스트림 생성
		printStream(Arrays.stream(sArr, 1, 3));
	}

	public static void varPramsToStream() {
		Stream<Double> dStream = Stream.of(4.2, 2.5, 3.1, 1.9);
		printStream(dStream);
	}

	public static void intStreamToStream() {
		IntStream iStream = IntStream.range(1, 4);
		printStream(iStream);

	}

	private static void printStringStream(Stream<String> iStream) {
		System.out.println(iStream.collect(Collectors.joining(" ")));
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
