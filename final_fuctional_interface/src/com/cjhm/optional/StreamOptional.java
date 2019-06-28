package com.cjhm.optional;

import java.util.Optional;

public class StreamOptional {

	// Stream to List
	public static void optional() {
		Optional<String> optString = Optional.ofNullable("자바 Optional 객체");
//		optString = Optional.ofNullable(null);
		if (optString.isPresent()) {
			System.out.println(optString.orElse("null!!!"));
		}else {
			
			System.out.println(optString.orElse("null!!!"));
		}
	}
}
