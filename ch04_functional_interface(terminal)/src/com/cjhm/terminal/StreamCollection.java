package com.cjhm.terminal;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import  java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.cjhm.Entity.User;

public class StreamCollection {

	//Stream to List
	public static void toLists() {
		Stream<String> stream = Stream.of("넷", "둘", "하나", "셋");
		List<String> list = stream.collect(toList());
		list.stream().reduce((x, y) -> x + "," + y).ifPresent(System.out::println);
		String result = list.stream().collect(Collectors.joining(","));
		System.out.println(result);
	}
	//Stream to Map
	public static void toMap() {
		List<User> list = new ArrayList<>();
		list.add(new User("Mohan",29));
		list.add(new User("Mohan",28));
		list.add(new User("Sohan",29));
		list.add(new User("Mahesh",21));
		Map<String, User> map = list.stream()
				.collect(Collectors.toMap(User::getUsername,Function.identity()));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}
	//스트림의 요소를 그룹화
	public static void groupingBy() {
		List<User> list = new ArrayList<>();
		list.add(new User("Mohan",29));
		list.add(new User("Mohan",29));
		list.add(new User("Mohan",28));
		list.add(new User("Sohan",29));
		list.add(new User("Mahesh",21));
		System.out.println("===============");
		Map<Integer, List<User>> map = list.stream().collect(Collectors.groupingBy(User::getAge));
		Map<String, List<User>> map2 = list.stream().collect(Collectors.groupingBy(User::getUsername));

		//distinct() 로 중복 제거도 할 수 있음
		Map<User, List<User>> map3 = list.stream().collect(Collectors.groupingBy(Function.identity()));
		map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
		map2.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
		map3.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
	}
	
	
	public static void toMapString() {
		List<String> list = Arrays.asList("A", "B", "C", "D", "A");
	    Map<String, List<String>> map = list.stream().collect(Collectors.groupingBy(Function.identity()));
	    map.forEach((x, y) -> System.out.println("Key: " + x +", value: "+ y));
		
	}

	//스트림의 요소를 2분할 map(boolean,object)
	public static void partitioningBy() {
		Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "PHP");
		Map<Boolean, List<String>> patition = stream.collect(Collectors.partitioningBy(StreamCollection::isBinary));
		List<String> oddLengthList = patition.get(false);
		System.out.println(oddLengthList);
		List<String> evenLengthList = patition.get(true);
		System.out.println(evenLengthList);
	}

	private static Boolean isBinary(String x) {
		return x.length()%2==0;
	}
	
	// 스트림을 소모(reduce)
	public static void reducing() {
		IntStream iStream = new Random().ints(1,46).distinct().limit(6).sorted();
		IntStream iStream2 = new Random().ints(1,46).distinct().limit(6).sorted();
		
		System.out.println(iStream.reduce((x,y)->x+y).getAsInt());

		// IntStream to Stream<Integer> (boxed())
		System.out.println(iStream2.boxed().collect(Collectors.reducing(0,(a,b)->a+b)));
	}
	// 문자열 스트림 요소 연결
	public static void joining() {
		Stream<String> stream = Stream.of("넷", "둘", "하나", "셋");
		List<String> list = stream.collect(toList());
//		list.stream().reduce((x, y) -> x + "," + y).ifPresent(System.out::println);
		String result = list.stream().collect(Collectors.joining(","));
		System.out.println(result);
	}
}
