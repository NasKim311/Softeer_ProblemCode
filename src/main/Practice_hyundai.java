package main;

import java.util.Scanner;

public class Practice_hyundai {

	public static void main(String[] args) {

//	현대자동차그룹(HMG)은 완성차인 현대자동차와 기아를 포함하여 6개 사업 영역(완성차, 철강, 건설, 부품, 금융, 기타)의 다양한 계열사를 포함하는 명칭이다.
//	HMG는 현대자동차그룹(Hyundai-Motor-Group)의 약자이다. 
//
//	보통 현대자동차그룹 이라고 부르기 길어 HMG라고 줄여서 부른다. 
//	이처럼 긴 단어를 한번에 쉽게 부르기 위한 약자들이 존재한다. 
//	예를 들면 현대자동차(Hyundai-Motor-Company)는 HMC 이다. 
//	회사들의 명칭을 줄여서 부르는 규칙은 단어의 첫 글자인 대문자를 조합하여 부른다. 
//	그 대문자들을 순서대로 작성하면 ‘약자(Abbreviation)’가 된다. 
//
//	이렇게 부르기 길어서 힘든 회사명을 위와 같은 규칙으로 약자로 만들어주는 프로그램을 작성해보자. 

		Scanner sc = new Scanner(System.in);

		String companyFullName = sc.next();

		// 한글자씩 쪼개서 배열에 할당
		String[] companyFullSpelling = companyFullName.split("");

		// 결과 값을 담을 변수 선언
		String companyAbbreviation = "";

		for (int i = 0; i < companyFullSpelling.length; i++) {

			// 아스키코드표 이용
			if (companyFullSpelling[i].charAt(0) >= 65 && companyFullSpelling[i].charAt(0) <= 90) {

				// 조건에 해당되는 값을 누적하여 할당
				companyAbbreviation += companyFullSpelling[i];

			}

		}

		System.out.println(companyAbbreviation);

	} // main method

} // Practice_hyundai class
