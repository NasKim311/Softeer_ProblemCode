package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice02_ver2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 요일별 근무시간 입력받기
		String MONWorkingTime = sc.nextLine();
		String TUEWorkingTime = sc.nextLine();
		String WEDWorkingTime = sc.nextLine();
		String THUWorkingTime = sc.nextLine();
		String FRIWorkingTime = sc.nextLine();

		// 모든 근무시간의 값을 넣은 배열 선언
		String[] ALLWorkingTime = {MONWorkingTime, TUEWorkingTime, WEDWorkingTime, THUWorkingTime, FRIWorkingTime};
		List<String[]> Start_EndTime = new ArrayList<>();
		
		for(int i = 0; i < ALLWorkingTime.length; i++) {
			Start_EndTime.add(ALLWorkingTime[i].split(" "));
		}
		
		for (int i = 0; i < Start_EndTime.size(); i++) {
			System.out.println(Start_EndTime.get(i)[i]);
		}
		
	} // main method

} // Practice02_ver2 class
