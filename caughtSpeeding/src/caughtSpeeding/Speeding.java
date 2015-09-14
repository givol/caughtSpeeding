package caughtSpeeding;

public class Speeding {
	
	public static void main(String[] args)
	{
		System.out.print(caughtSpeeding(60, false)); // should return 0
		System.out.print(caughtSpeeding(65, false)); // should return 1
		System.out.print(caughtSpeeding(65, true)); // should return 0
	}
	
	public static int caughtSpeeding(int speed, boolean isBirthday)
	{
		if(speed <= 60 && isBirthday == false || isBirthday == true && speed <= 65){
			return 0;
		} else if(speed <= 80 && speed >= 61 && isBirthday == false || speed <= 85 && speed >= 66 && isBirthday == true) {
			return 1;
		} else if(isBirthday == false && speed >= 81 || isBirthday == true && speed >= 86){
			return 2;
		}
		return 0;
			
	}
}
