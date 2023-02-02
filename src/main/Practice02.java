package main;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 요일별 근무시간 입력받기
		String MONWorkingTime = sc.nextLine();
		String TUEWorkingTime = sc.nextLine();
		String WEDWorkingTime = sc.nextLine();
		String THUWorkingTime = sc.nextLine();
		String FRIWorkingTime = sc.nextLine();
		
		sc.close();

		// 요일별 출근시간,퇴근시간으로 쪼개기
		String[] MONWorkingTimes = MONWorkingTime.split(" ");
		String[] TUEWorkingTimes = TUEWorkingTime.split(" ");
		String[] WEDWorkingTimes = WEDWorkingTime.split(" ");
		String[] THUWorkingTimes = THUWorkingTime.split(" ");
		String[] FRIWorkingTimes = FRIWorkingTime.split(" ");

		// 요일별 출근시간,퇴근시간별 시,분으로 쪼개기
		String[] MONStartTimes = MONWorkingTimes[0].split(":");
		String[] MONEndTimes = MONWorkingTimes[1].split(":");

		String[] TUEStartTimes = TUEWorkingTimes[0].split(":");
		String[] TUEEndTimes = TUEWorkingTimes[1].split(":");

		String[] WEDStartTimes = WEDWorkingTimes[0].split(":");
		String[] WEDEndTimes = WEDWorkingTimes[1].split(":");

		String[] THUStartTimes = THUWorkingTimes[0].split(":");
		String[] THUEndTimes = THUWorkingTimes[1].split(":");

		String[] FRIStartTimes = FRIWorkingTimes[0].split(":");
		String[] FRIEndTimes = FRIWorkingTimes[1].split(":");

		// 형변환 후 변수에 할당
		int MONStartHour = Integer.parseInt(MONStartTimes[0]);
		int MONStartMinute = Integer.parseInt(MONStartTimes[1]);
		int MONEndHour = Integer.parseInt(MONEndTimes[0]);
		int MONEndMinute = Integer.parseInt(MONEndTimes[1]);

		int TUEStartHour = Integer.parseInt(TUEStartTimes[0]);
		int TUEStartMinute = Integer.parseInt(TUEStartTimes[1]);
		int TUEEndHour = Integer.parseInt(TUEEndTimes[0]);
		int TUEEndMinute = Integer.parseInt(TUEEndTimes[1]);

		int WEDStartHour = Integer.parseInt(WEDStartTimes[0]);
		int WEDStartMinute = Integer.parseInt(WEDStartTimes[1]);
		int WEDEndHour = Integer.parseInt(WEDEndTimes[0]);
		int WEDEndMinute = Integer.parseInt(WEDEndTimes[1]);

		int THUStartHour = Integer.parseInt(THUStartTimes[0]);
		int THUStartMinute = Integer.parseInt(THUStartTimes[1]);
		int THUEndHour = Integer.parseInt(THUEndTimes[0]);
		int THUEndMinute = Integer.parseInt(THUEndTimes[1]);

		int FRIStartHour = Integer.parseInt(FRIStartTimes[0]);
		int FRIStartMinute = Integer.parseInt(FRIStartTimes[1]);
		int FRIEndHour = Integer.parseInt(FRIEndTimes[0]);
		int FRIEndMinute = Integer.parseInt(FRIEndTimes[1]);

		// 요일별 결과값을 담을 변수 선언
		int MONResult = 0;
		int TUEResult = 0;
		int WEDResult = 0;
		int THUResult = 0;
		int FRIResult = 0;

		// MONResult
		if (MONEndMinute - MONStartMinute >= 0) {

			MONResult = (MONEndHour - MONStartHour) * 60 + (MONEndMinute - MONStartMinute);

		} else {

			MONResult = (MONEndHour - 1 - MONStartHour) * 60 + (60 + MONEndMinute - MONStartMinute);
		}

		// TUEResult
		if (TUEEndMinute - TUEStartMinute >= 0) {

			TUEResult = (TUEEndHour - TUEStartHour) * 60 + (TUEEndMinute - TUEStartMinute);

		} else {

			TUEResult = (TUEEndHour - 1 - TUEStartHour) * 60 + (60 + TUEEndMinute - TUEStartMinute);
		}

		// WEDResult
		if (WEDEndMinute - WEDStartMinute >= 0) {

			WEDResult = (WEDEndHour - WEDStartHour) * 60 + (WEDEndMinute - WEDStartMinute);

		} else {

			WEDResult = (WEDEndHour - 1 - WEDStartHour) * 60 + (60 + WEDEndMinute - WEDStartMinute);
		}

		// THUResult
		if (THUEndMinute - THUStartMinute >= 0) {

			THUResult = (THUEndHour - THUStartHour) * 60 + (THUEndMinute - THUStartMinute);

		} else {

			THUResult = (THUEndHour - 1 - THUStartHour) * 60 + (60 + THUEndMinute - THUStartMinute);
		}

		// FRIResult
		if (FRIEndMinute - FRIStartMinute >= 0) {

			FRIResult = (FRIEndHour - FRIStartHour) * 60 + (FRIEndMinute - FRIStartMinute);

		} else {

			FRIResult = (FRIEndHour - 1 - FRIStartHour) * 60 + (60 + FRIEndMinute - FRIStartMinute);
		}

		// 총 근무 시간
		int ALLResult = MONResult + TUEResult + WEDResult + THUResult + FRIResult;

		System.out.println(ALLResult);

	} // main method

} // Practice02 class
