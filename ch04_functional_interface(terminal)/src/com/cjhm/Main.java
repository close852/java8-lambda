package com.cjhm;


import static com.cjhm.terminal.StreamCollection.reducing;

/**
 * <h1>스트림의 최종 연산(terminal op)</h1><br>
 * 1. 요소의 출력 : forEach()<br>
 * 2. 요소의 소모 : reduce()<br>
 * 3. 요소의 검색 : findFirst(), findAny()<br>
 * 4. 요소의 검사 : anyMatch(), allMatch(), noneMatch()<br>
 * 5. 요소의 통계 : count(), min(), max()<br>
 * 6. 요소의 연산 : sum(), average()<br>
 * 7. 요소의 수집 : collect()
 * 
 */
public class Main {

	public static void main(String[] args) {
//		toLists();
		reducing();
//		toMapString();
//		partitioningBy();		
	}

}
