/*
Name : Riksa Meidy Karim
Student ID : 1301142289
Class : IF-38-09

*/
import java.util.Scanner;

class IndexPoint{
		public static void main(String[] args){
			double a,b,c,score;
			String grade;
			Scanner s = new Scanner(System.in);
			System.out.print("Masukkan nilai UTS: ");
			a = s.nextDouble();
			System.out.print("Masukkan nilai UAS: ");
			b = s.nextDouble();
			System.out.print("Masukkan nilai Quiz: ");
			c = s.nextDouble();
			score = a*0.4 + b*0.35 + c*0.25;
			if((score>84)&&(score<=100)){grade = "excellent";}
			else if(score>74){grade = "very good";}
			else if(score>64){grade = "good";}
			else if(score>49){grade = "accepted";}
			else if(score>=0){grade = "failed";}
			else{grade = "incorrect";}
			System.out.println("Nilai Akhir Kamu adalah: "+ score);
			if(grade!="incorrect"){
			System.out.println("Grade Kamu adalah: "+ grade);
			}
			else{System.out.println("Nilai yang diinputkan salah");}
		}
	
	
	
}
