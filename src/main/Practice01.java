package main;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String distanceDriven = sc.nextLine();
		
		sc.close();

		String[] distanceArr = distanceDriven.split(" ");
		int distanceA = Integer.parseInt(distanceArr[0]);
		int distanceB = Integer.parseInt(distanceArr[1]);

		if (distanceA > distanceB) {
			System.out.println("A");
		} else if (distanceA < distanceB) {
			System.out.println("B");
		} else {
			System.out.println("same");
		}

	} // main method

} // Practice01 class
