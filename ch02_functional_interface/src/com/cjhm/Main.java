package com.cjhm;

import static com.cjhm.collection.NewStream.*;

/**
 * <h1>Stream API의 특정</h1><br>
 * - 내부 반복을 토한 작업수행 <br>
 * - 한번만 사용 가능(또 쓰고 싶으면 다시 받아서 사용 필요) - call by value 특징 <br>
 * - 원본 데이터를 변경하지 않음 - call by value 특징<br>
 * - Lazy 하게 연산한다 (성능 최적화) <br>
 * - parallelStream()으로 병렬처리 지원 <br>
 * <br>
 * <h1>동작의 흐름</h1><br>
 * 1. Stream 생성<br>
 * 2. Stream 중간 연산<br>
 * 3. Stream 최종 연산<br>
 * 
 */
public class Main {

	public static void main(String[] args) {
		collectionNumberToSteram();
		collectionObjectToSteram();
		collectionStringToSteram();
		arrayToStream();
	}

}
