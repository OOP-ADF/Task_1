//Name 			: Mohammad Zakie Faiz Rahiemy
//Student ID 	: 1301144422
//Class			: IF-38-02

import java.util.Scanner;

public class IndexPoint {
	public static void main(String[] args){
		double midScore, endScore, quizScore, finalScore;
		Scanner input=new Scanner(System.in);
		System.out.print("Mid-term score : ");
		midScore = input.nextDouble();
		if (midScore > 100 || midScore < 0){
			System.out.print("Mid-term score must 0<x<100!");
			midScore = input.nextDouble();
		}
		System.out.print("End-term score : ");
		endScore = input.nextDouble();
		if (endScore > 100 || endScore < 0){
			System.out.print("End-term score must 0<x<100!");
			endScore = input.nextDouble();
		}
		System.out.print("Quiz score 	 : ");
		quizScore = input.nextDouble();
		if (quizScore > 100 || quizScore < 0){
			System.out.print("Quiz score must 0<x<100!");
			quizScore = input.nextDouble();
		}
		finalScore = (midScore*0.35)+(endScore*0.4)+(quizScore*0.25);
		if (finalScore>=85 && finalScore<=100){
			System.out.print("Excellent");
		} else if (finalScore>=75 && finalScore<85){
			System.out.print("Very Good");
		} else if (finalScore>=65 && finalScore<75){
			System.out.print("Good");
		} else if (finalScore>=50 && finalScore<65){
			System.out.print("Accepted");
		} else if (finalScore>=0 && finalScore<50){
			System.out.print("Failed");
		}
	}
}