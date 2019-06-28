package com.cjhm.terminal;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduce {
	

	public static void reduce() {
		Stream<String> stream1 = Stream.of("넷", "둘", "셋", "하나");
		Stream<String> stream2 = Stream.of("넷", "둘", "셋", "하나");
		
		//ifPresent ?
		stream1.reduce((s1,s2)->s1+","+s2).ifPresent(System.out::println);;
//		String result = stream2.collect(Collectors.joining(","));
		String result = stream2.reduce((s1,s2)->s1+","+s2).get();
		System.out.println(result);
	}
	
	public static void intReduce() {
		IntStream is = IntStream.of(1,2,3,4);
		IntStream is2 = IntStream.of(1,2,3,4);
		int sum = is.reduce((x,y)->x+y).getAsInt();
		System.out.println(sum);
		int identity =12;
		//특정 값(indentity)에다 reduce 연산을 진행
		int sum2 =is2.reduce(identity, (x,y)->x+y);
		System.out.println(sum2);

		
	}

}
