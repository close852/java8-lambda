package com.cjhm;

import static com.cjhm.mid.StreamSort.*;

/**
 * <h1>스트림 중개연산(intermediate op)</h1><br>
 * 
 * 1. 스트림 필터링 : filter(), distinct()<br>
 * -> ex) filter는 말그대로 filter, distinct는 중복 제거
 * 2. 스트림 변환 : map(), flatMap()<br>
 * -> ex) map은 기존 것에 대한 변경, flatMap은 arr/list 구조를 하나로 합침.<br>
 * 3. 스트림 제한 : limit(), skip()<br> 
 * -> ex) list.idx를 몇개로 제한하여 출력할거인지(limit), 몇번부터 출력할 것인지(skip)<br>
 * 4. 스트림 정렬 : sorted()<br>
 * -> ex) sort는 intStream의 reverse구하는 법, 숫자String의 정렬 하는 방법 <br>
 * 5. 스트림 연산 결과 확인 : peek()<br>
 * -> ex) 대체로 debug로 결과 확인 용
 */
public class Main {

	public static void main(String[] args) {
		objStreamToSort();
	}

}
