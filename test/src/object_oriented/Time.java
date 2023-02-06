package object_oriented;

import java.util.Scanner;

public class Time {
//atrributes

	private int hours;
	private int minutes;
	private int seconds;

	int hoursInSeconds;
	int minutesInSeconds;
	int correntHourInseconds;
//	private int maxHours = 24;
//	private  int maxMinutes = 59;
//	private  int maxSeconds = 59;
//	private int minHours = 1;
//	private  int minMinutes = 1;
//	private  int minSeconds = 1;

	// constructors
	public Time() {
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		Scanner in = new Scanner(System.in);
		
		
		// take care of errors

		while ((hours >23 || hours < 0)) {
			System.out.println(" the hour is incorrect please enter  anew hour");
			hours = in.nextInt();
		}
		this.hours = hours;
		
		while ((minutes >59 || minutes < 0)) {
			System.out.println(" the hour is incorrect please enter  anew hour");
			minutes = in.nextInt();
		}
		this.minutes = minutes;
		
		while ((seconds >59 || seconds < 0)) {
			System.out.println(" the hour is incorrect please enter  anew hour");
			seconds = in.nextInt();
		}
		this.seconds = seconds;
		
	}

	// 3 getters
	private int getHours() {
		return hours;
	}

	private int getMinutes() {
		return minutes;
	}

	private int getSeconds() {
		return seconds;
	}

	private void printFull() {
		System.out.println(hours + ":" + minutes + ":" + seconds);
	}
	// 2 setters

	private void deccrement(int hours, int minutes, int seconds) {
		// do all to seconds
		// to do in function

		hoursInSeconds = (hours * 3600);
		minutesInSeconds = minutes * 60;
		correntHourInseconds = (hours * 3600) + (minutes * 60) + seconds;

		// decrease

		correntHourInseconds -= (hoursInSeconds + minutesInSeconds);

		this.seconds = correntHourInseconds % 60;
		this.minutes = ((correntHourInseconds % 3600) % 60) / 60;
		this.hours = (correntHourInseconds / 3600) % 24;

//	
	}

	private void increment(int hours, int minutes, int seconds) {
		// hours

		// do all to seconds
		// to do in function

		hoursInSeconds = (hours * 3600);
		minutesInSeconds = minutes * 60;
		correntHourInseconds = hoursInSeconds + minutesInSeconds + seconds;

		// increase

		correntHourInseconds += (hoursInSeconds + minutesInSeconds);

		this.seconds = correntHourInseconds % 60;
		this.minutes = (correntHourInseconds % 3600) / 60;
		this.hours = correntHourInseconds / 3600;

	}

}


//for (int i = 0; i < hours; i++) {
//	if(this.hours<1) {this.hours = maxHours;}
//	this.hours--;			
//}
//for (int i = 0; i < minutes; i++) {
//	if(this.minutes<1) {
//		this.minutes = maxMinutes;
//		this.hours --;
//	}
//	this.hours--;			
//}
//for (int i = 0; i < hours; i++) {
//	if(this.hours<1) {this.hours = 24;}
//	this.hours--;			
//}