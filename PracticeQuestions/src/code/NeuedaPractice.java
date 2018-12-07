package code;

import java.awt.List;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NeuedaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// questionOne();
		// questionTwo();
		// questionThree();
		// questionFour();
		// questionFive();
		// questionSix();
		// questionSeven();
		// questionEight();
		// questionNine();
		// questionTen();
		// questionEleven();
		questionTwelve();
	}

	private static void questionTwelve() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows: ");
		int rows = sc.nextInt();

		int hashes = 1;
		int spaces = rows - 1;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < hashes; k++) {
				System.out.print("#");
			}

			spaces -= 1;
			hashes += 2;
			System.out.println("");

		}

	}

	private static void questionEleven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your phrase here: ");
		String phrase = sc.next();
		int count = 0;

		for (int i = 0; i < phrase.length(); i++) {
			char c = phrase.charAt(i);

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				count++;
			}

		}

		System.out.println("Number of vowels: " + count);
	}

	private static void questionTen() {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		System.out.println("Enter the temperature in fahrenheit: ");
		double fahrenheit = sc.nextDouble();
		double celcius = (fahrenheit - 32) * 5 / 9;
		System.out.println("Temperature in celcius is: " + df.format(celcius));

	}

	private static void questionNine() {
		int[] ogList = { 11, 11, 14, 10, 9, 2, 11, 9, 1, 14, 0, 19, 18, 13, 11, 17, 1, 3 };
		int[] list = { ogList[0], ogList[ogList.length - 1] };

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}

	}

	private static void questionEight() {
		int secretNum = 5;
		boolean valid = false;
		int tries = 0;

		Scanner sc = new Scanner(System.in);

		while (valid == false) {
			System.out.println("Guess a number: ");
			int guessedNum = sc.nextInt();

			if (guessedNum == secretNum) {
				tries++;
				valid = true;
				break;
			}

			if (guessedNum > secretNum) {
				System.out.println("Number is lower");
			}

			if (guessedNum < secretNum) {
				System.out.println("Number is higher");
			}

			tries++;
		}

		System.out.println("You guessed correctly in " + tries + " tries.");

	}

	private static void questionSeven() {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 7; i++) {
			System.out.println("Enter a number");
			int newNum = sc.nextInt();
			nums.add(newNum);
		}

		System.out.println("Max: " + Collections.max(nums));
		System.out.println("Min: " + Collections.min(nums));

	}

	private static void questionSix() {
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}

		}

	}

	private static void questionFive() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number to count up to:");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {

			sum = i + sum;

			System.out.println(sum);
		}

	}

	private static void questionFour() {
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 12; j++) {
				System.out.println(i + "*" + j);
			}
		}

	}

	private static void questionThree() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to count up to:");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i * 3 > num) {

			} else {
				System.out.println(i * 3);
			}

		}
	}

	private static void questionTwo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to count up to:");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

	}

	public static void questionOne() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
	}

}
