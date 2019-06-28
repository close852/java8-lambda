package com.cjhm.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamFind {
	

	public static void find() {
		IntStream stream1 = IntStream.of(4, 2, 7, 3, 5, 1, 6);
		IntStream stream2 = IntStream.of(4, 2, 7, 3, 5, 1, 6);

		OptionalInt result1 = stream1.sorted().findFirst();
		System.out.println(result1.getAsInt());

		//병렬 스트림에 대한 결과는 findAny로 찾아야 함.
		OptionalInt result2 = stream2.findAny();
		System.out.println(result2.getAsInt());

	}

}
