package com.cjhm.mid;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.cjhm.Entity.User;

public class StreamFilter {
	
	public static void intStreamFilter() {
		IntStream stream1 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		IntStream stream2 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		IntStream stream3 = IntStream.of(7, 5, 5, 2, 1, 2, 3, 5, 4, 6);
		
		System.out.print("중복 : ");
		printStream(stream1);
		IntStream dupStream = stream2.distinct();
		System.out.print("중복제거(distinct) : ");
		printStream(dupStream);
		
		IntStream dup3 = stream3.distinct().filter(i->i%2!=0);
		System.out.print("홀수만 : ");
		printStream(dup3);
		
	}
	
	public static void streamFilter() {
		Stream<String> strStream = Stream.of("HTML","CSS","JAVA");
		
		//Stream의 len이 3보다 큰 것만 map함
		Stream<String> mapStream = strStream.filter(s->s.length()>3).map(s->s+" language");
		printStringStream(mapStream);
	}
	
	public static void streamObjectFilter() {
		Stream<User> userStream = Stream.of(new User("jiwoo", 29),new User("mira", 28),new User("john", 15));
		Stream<User> userStream2 = Stream.of(new User("jiwoo", 29),new User("mira", 28),new User("john", 15));

		
		Stream<String> sStream = userStream.filter(u->u.getUsername().startsWith("j")).map(u->u.getUsername()+"/"+(u.getAge()));
		printStringStream(sStream);
		//단순 출력
		Stream<String> iStream = userStream2.filter(u->u.getAge()>20).map(u->u.getUsername()+"/"+(u.getAge()));
		printStringStream(iStream);
	}
	private static void printStringStream(Stream<String> iStream) {
		System.out.println(iStream.collect(Collectors.joining(", ")));
	}

//	private static <T> void printStream(Stream<T> iStream) {
//		iStream.forEach(e -> System.out.print(e + " "));
//		System.out.println();
//	}

	private static void printStream(IntStream iStream) {
		iStream.forEach(e -> System.out.print(e + " "));
		System.out.println();
	}

}
