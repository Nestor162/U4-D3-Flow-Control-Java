package app;

public class Exercise1 {

	public static void main(String[] args) {

		System.out.printf("Il numero dei caratteri è pari? %b \n", strOddEven("hello"));
		System.out.printf("Il numero dei caratteri è pari? %b \n", strOddEven("world!"));

		System.out.printf("L'anno è bisestile? %b \n", leapYear(2023));
		System.out.printf("L'anno è bisestile? %b \n", leapYear(2016));

	}

	public static boolean strOddEven(String str) {
		return (str.length() % 2 == 0) ? true : false;

	}

	public static boolean leapYear(int year) {
		return (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0) ? true : false);
	}

}
