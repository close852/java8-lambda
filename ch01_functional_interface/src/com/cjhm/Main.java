package com.cjhm;

import com.cjhm.fi.BiComputeFunc;
import com.cjhm.fi.ComputeFunc;

public class Main {

	public static void main(String[] args) {

		int a = 13;
		int b = 23;
		// (x,y)->Math.pow(x,y) 를 아래와 같이 참조변수로 표현 가능

		BiComputeFunc func1 = (x, y) -> Math.pow(x, y);
		BiComputeFunc func2 = Math::pow;
		ComputeFunc func3 = Double::new;
		System.out.println(func1.accept(a, b));
		System.out.println(func2.accept(a, b));
		System.out.println(func3.accept(a));

	}

}
