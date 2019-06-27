package com.cjhm.terminal;

import java.util.stream.IntStream;

public class StreamMatch {

	public static void match() {
		IntStream stream1 = IntStream.of(30, 90, 70, 10);
		IntStream stream2 = IntStream.of(30, 90, 70, 10);

		// return T/F
		System.out.println(stream1.anyMatch(n -> n > 80));
		System.out.println(stream2.allMatch(n -> n > 80));

	}

}
