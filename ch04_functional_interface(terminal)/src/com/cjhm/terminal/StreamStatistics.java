package com.cjhm.terminal;

import java.util.stream.IntStream;

public class StreamStatistics {

	public static void match() {
		IntStream stream1 = IntStream.of(30, 90, 70, 10);
		IntStream stream2 = IntStream.of(30, 90, 70, 10);
		IntStream stream3 = IntStream.of(30, 90, 70, 10);

		// return T/F
		System.out.println(stream1.count());
		System.out.println(stream2.min().orElse(0));
		System.out.println(stream3.max().getAsInt());

	}

}
