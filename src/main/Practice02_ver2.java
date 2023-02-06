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
		//	ex) ALLWorkingTime = {10:00 19:00 , 09:00 15:00 , ...}
		
		String[] ALLWorkingTime = { MONWorkingTime, TUEWorkingTime, WEDWorkingTime, THUWorkingTime, FRIWorkingTime };

		// 출근시간과 퇴근시간을 쪼갠 값이 들어간 배열을 담을 list 선언 (리스트의 값은 월~금요일 순서)	
		//	ex) Start_EndTime = [ {10:00 , 19:00} , {09:00 , 15:00} ,... ]
		
		List<String[]> Start_EndTime = new ArrayList<>();

		for (int i = 0; i < ALLWorkingTime.length; i++) {
			Start_EndTime.add(ALLWorkingTime[i].split(" "));
		}

		// 출근시간과 퇴근시간 각각 시,분으로 쪼갠 값이 들어간 배열을 담을 list 선언	(리스트의 값은 월~금요일 순서)	
		//	ex) Start_HourMinute = [{10 , 00} , {09 , 00} , ...]
		//		End_HourMinute	 = [{19 , 00} , {15 , 00} , ...]
		
		List<String[]> Start_HourMinute = new ArrayList<>();
		List<String[]> End_HourMinute = new ArrayList<>();
		
		
		for (int i = 0; i < Start_EndTime.size(); i++) {
//			System.out.println(Start_EndTime.size());
//			System.out.println(Start_EndTime.get(i)[0]);
//			System.out.println(Start_EndTime.get(i)[1]);
			
			Start_HourMinute.add(Start_EndTime.get(i)[0].split(":"));
			End_HourMinute.add(Start_EndTime.get(i)[1].split(":"));
		}
		
		int result = 0;
		
		for (int i = 0; i < Start_HourMinute.size(); i++) {
			
			// 각 요일의 출근시간의 '시'
			int startHour = Integer.parseInt(Start_HourMinute.get(i)[0]);
			int startMinute = Integer.parseInt(Start_HourMinute.get(i)[1]);
			int endHour = Integer.parseInt(End_HourMinute.get(i)[0]);
			int endMinute = Integer.parseInt(End_HourMinute.get(i)[1]);		
			
			// 퇴근시간의 분이 출근시간의 분 보다 클 때
			if(endMinute - startMinute >= 0) {
				result += (endHour - startHour) * 60 + (endMinute - startMinute);
				
			// 퇴근시간의 분이 출근시간의 분 보다 작을 때
			} else {
				result += (endHour - 1 - startHour) * 60 + (60 + endMinute - startMinute);
			}
			
		}
		
		System.out.println(result);
		
	} // main method

} // Practice02_ver2 class
