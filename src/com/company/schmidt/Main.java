package com.company.schmidt;

public class Main {

	public static void main(String[] args) {
		int[] temp = {45, 29, 10, 22, 41, 28, 33};
		int[] precip = {95, 60, 25, 5, 0, 75, 90};
		String daysList[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


		for (int i = 1; i < temp.length-1; i++) {
			if (temp[i] <= 32)
				for (i = 1; i < precip.length - 1; i++) {
					if (precip[i] < 50)
						continue;

					while (precip[i] < 50 && temp[i] <= 32) ;
					{
						System.out.println("On " + daysList[i] + " The chance of snow will be " + precip[i] + "%");
						System.out.println("On " + daysList[i] + " the temp will be " + temp[i] + "°");

					}


				}


		}
	}
}

