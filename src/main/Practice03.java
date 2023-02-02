package main;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 테스트 케이스의 개수를 입력받을 변수 선언
		int testCaseCnt = sc.nextInt();
		sc.nextLine(); // 남은 \n을 제거하기 위한 로직

		// 테스트 케이스를 입력 받을 배열 선언
		String[] caseAB = new String[testCaseCnt];
		
		// 테스트 케이스 합을 담을 배열 선언
		int[] caseResult = new int[testCaseCnt];
		
		for (int i = 0; i < testCaseCnt; i++) {
			caseAB[i] = sc.nextLine();
			caseResult[i] = Integer.parseInt((caseAB[i].split(" "))[0])  + Integer.parseInt((caseAB[i].split(" "))[1]); 
		}
		
		sc.close();
		
		for (int i = 0; i < testCaseCnt; i++) {
			System.out.println("Case #" + (i + 1) + ": " + caseResult[i]);
		}
		

	} // main method

} // Practice03 class
