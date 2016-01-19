
//Tari Lestari (130114481) 	IF-38-01


import java.util.Scanner;

 
 public class indeksnilai {
	public static void main(String[]args){
	Scanner masukan = new Scanner (System.in);
	System.out.println("Masukkan nilai UTS : ");
	double uts = masukan.nextInt();
	System.out.println("Masukkan nilai UAS : ");
	double uas = masukan.nextInt();
	System.out.println("Masukkan nilai Quiz : ");
	double quiz = masukan.nextInt();
	
	double hasil = (uts*0.35 + uas*0.4 + quiz*0.25);
	
	        if (hasil >= 85 && hasil <= 100){
            System.out.println("luar biasa");
        }
        else if (hasil >= 75 && hasil <= 84){
            System.out.println("sangat baik");
        }
        else if (hasil >= 65 && hasil <= 74){
            System.out.println("baik");
        }
        else if (hasil >= 50 && hasil <= 64){
            System.out.println("diterima");
        }
        else if (hasil >= 0 && hasil <= 49){
            System.out.println("gagal");
        }
    }
    
}
