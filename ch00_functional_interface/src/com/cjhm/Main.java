package com.cjhm;

import com.cjhm.fi.ComputeFunc;

public class Main {

	public static void main(String[] args) {

		int a = 1;
		int b = 2;
		ComputeFunc func = (x, y) -> x - y;
		System.out.println(func.accept(a,b));
		
		func = (x, y) -> x + y;
		System.out.println(func.accept(a,b));
		
		func = (x, y) -> x * y;
		System.out.println(func.accept(a,b));
		
		func = (x, y) -> x / y;
		System.out.println(func.accept(a,b));

		func = (x, y) -> x > y?x:y;
		System.out.println(func.accept(a,b));
		
		func = Integer::compareTo;
		System.out.println(func.accept(a,b));
	}

}
