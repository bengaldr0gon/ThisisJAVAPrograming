package ch07.review;

import java.util.Scanner;

public class ScoreExample {

	public static void main(String[] args) {
		Score gd = new Score();
		Scanner sc = new Scanner(System.in);
		int Score = sc.nextInt();
		
		gd.grade(Score);
		
		sc.close();
		

	}

}
