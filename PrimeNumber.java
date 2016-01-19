
//Tari Lestari (130114481) 	IF-38-01


import java.util.Scanner;

 
 public class primenumber {
	public static void main(String[]args){
	Scanner masukan = new Scanner (System.in);
	System.out.println("Masukkan bilangan : ");
	int bilangan = masukan.nextInt();
	boolean prima = true;
	for (int i=2; i<bilangan; i++){
	
	if ((bilangan % i) == 0){
			prima = false; 
			break;
		}
	}
	 if (prima == true){
	
	System.out.println(bilangan + " merupakan bilangan prima ");
	}else if ( prima== false){
	System.out.println(bilangan + " merupakan bukan bilangan prima");
		}
	}
}
