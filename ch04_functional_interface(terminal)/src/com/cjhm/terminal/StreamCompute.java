package com.cjhm.terminal;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamCompute {

	public static void match() {
		IntStream stream1 = IntStream.of(30, 90, 70, 10);
		DoubleStream stream2 = DoubleStream.of(30.3, 90.9, 70.7, 10.1);

		// return T/F
		System.out.println(stream1.sum());
		System.out.println(stream2.average().getAsDouble());

	}

}
