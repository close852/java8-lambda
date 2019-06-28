package com.cjhm.mid;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.cjhm.Entity.User;

public class StreamSort {
	
	public static void streamToLimit() {
		Stream<String> stream = Stream.of("HTML", "CSS", "JAVA", "JAVASCRIPT", "JAVACOFFEE");
		//Stream 들의 skip과 limit로 갯수 설정
		Stream<String> iStream = stream.filter(s->s.startsWith("J")).skip(1).limit(1);
		printStringStream(iStream);
	}
	
	public static void intStreamToSort() {
		Stream<Integer> stream1 = Stream.of(5,4,3,1,56,3,5,6,2,34,1);
		Stream<Integer> sorted = stream1.sorted();
		System.out.print("sorted : ");
		printStream(sorted);
		
		Stream<Integer> stream2 = Stream.of(5,4,3,1,56,3,5,6,2,34,1);
		Stream<Integer> distinct = stream2.distinct().sorted();
		
		System.out.print("distinct&sorted : ");
		printStream(distinct);

		Stream<Integer> stream3 = Stream.of(5,4,3,1,56,3,5,6,2,34,1);
		ArrayDeque<Integer> revList = stream3.distinct().sorted().collect(ArrayDeque::new,(deq,e)->deq.addFirst(e),(deq1,deq2)->deq1.addAll(deq2));
		Stream<Integer> reverseStream = revList.stream();
		System.out.print("distinct&reverse : ");
		printStream(reverseStream);
	}
	
	public static void stringStreamToSort() {
		Stream<String> stream1 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS","1","11","33","3");
		Stream<String> stream2 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS","1","11","33","3");
		Stream<String> stream3 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS","1","11","33","3");
		Stream<String> stream4 = Stream.of("JAVA", "HTML", "JAVASCRIPT", "CSS","1","11","33","3");

		Stream<String> sorted = stream1.sorted();
		System.out.print("sorted : ");
		printStringStream(sorted);

		Stream<String> reverse = stream2.sorted(Comparator.reverseOrder());
		System.out.print("reverse : ");
		printStringStream(reverse);

		Comparator<String> ascComp = (str1, str2) -> {
			try {
				return getInt(str1) > getInt(str2) ? 1 : -1;
			} catch (NumberFormatException e) {
				return str1.compareTo(str2);
			}
		};
		Comparator<String> descComp = (str1, str2) -> {
			try {
				return getInt(str1) < getInt(str2) ? 1 : -1;
			} catch (NumberFormatException e) {
				return str2.compareTo(str1);
			}
		};
		
		Stream<String> dicSortAsc= stream3.sorted(ascComp);
		System.out.print("dicSortAsc : ");
		printStringStream(dicSortAsc);
		
		Stream<String> dicSortDesc= stream4.sorted(descComp);
		System.out.print("dicSortDesc : ");
		printStringStream(dicSortDesc);


	}
	
	public static void objStreamToSort() {
		Stream<User> stream1 = Stream.of(new User("jiwoo", 22),new User("mira", 28),new User("john", 15));
		Stream<User> stream2 = Stream.of(new User("jiwoo", 22),new User("mira", 28),new User("john", 15));
		Stream<User> stream3 = Stream.of(new User("11", 22),new User("3", 28),new User("1", 15));
		Stream<User> stream4 = Stream.of(new User("3", 22),new User("11", 28),new User("1", 15));
		
		//compareable 구현 있어야 사용 가능
		System.out.println("UserVO에 compareable 구현!");
		Stream<User> sorted = stream1.sorted();
		Stream<User> revSorted = stream2.sorted(Comparator.reverseOrder());
		System.out.println("나이 정렬");
		printStream(sorted);
		printStream(revSorted);
		
		
		//dic asc sort 동일!
		Comparator<? super User> ascComp = (str1, str2) -> {
			try {
				return getInt(str1.getUsername()) > getInt(str2.getUsername()) ? 1 : -1;
			} catch (NumberFormatException e) {
				return str1.compareTo(str2);
			}
		};
		//dic desc sort 동일!
		Comparator<? super User> descComp = (str1, str2) -> {
			try {
				return getInt(str1.getUsername()) < getInt(str2.getUsername()) ? 1 : -1;
			} catch (NumberFormatException e) {
				return str2.compareTo(str1);
			}
		};
		System.out.println("이름(dic) 정렬");
		Stream<User> dicSorted = stream3.sorted(ascComp);
		Stream<User> dicRevSorted = stream4.sorted(descComp);

		printStream(dicSorted);
		printStream(dicRevSorted);
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

	private static int getInt(String str) throws NumberFormatException {
		return Integer.parseInt(str);
	}
}
