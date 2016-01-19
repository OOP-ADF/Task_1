import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        System.out.println("Program Index Point");
        System.out.println();
        Scanner input = new Scanner(System.in);
		System.out.print("NIM        : ");
		int nim = input.nextInt();
        System.out.print("Nilai UTS  : ");
        int uts = input.nextInt();
        System.out.print("Nilai UAS  : ");
        int uas = input.nextInt();
        System.out.print("Nilai Quiz : ");
        int quiz = input.nextInt();
        
        System.out.println();
        
        double na = ((0.35*uts) + (0.4*uas) + (0.25*quiz));
        
		System.out.println("NIM         : "+nim);
		System.out.println("Nilai Akhir : "+na);
		System.out.print  ("Grade       : ");
        if (na >= 85 && na <= 100){
            System.out.println("Excellent");
        }
        else if (na >= 75 && na < 85){
            System.out.println("Very Good");
        }
        else if (na >= 65 && na < 75){
            System.out.println("Good");
        }
        else if (na >= 50 && na < 65){
            System.out.println("Accepted");
        }
        else if (na >= 0 && na < 50){
            System.out.println("Failed");
        }
		else {
			System.out.println("Nilai yang diinput SALAH");
		}
    }
    
}
