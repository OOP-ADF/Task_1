// Name	: Gangsar Yoga Pamungkas
// NIM		: 1301154096
// Kelas	: IF-39-12
import java.util.InputMismatchException;
import java.util.Scanner;


public class TemperatureConvert{
	public static void main(String[] args) {
		float c,f,r,k;
		int pilih;
		String answer = null;
		int userchoice;
		

		Scanner input  = new Scanner(System.in);
		System.out.print("masukkan suhu dalam Celcius : ");
		c = input.nextInt();
		do{
		System.out.println("1. Fahrenheit ");
		System.out.println("2. Reamur ");
		System.out.println("3. Kelvin ");
		System.out.println("4. Exit");
		System.out.println("pilih conversi : ");
		
		try{
			pilih = input.nextInt();
		
			switch(pilih){
				case 1:
				f = (9*c)/5+32;
				System.out.println("Hasil Fahrenheit : "+f);
				break;
				case 2:
				r = (4* c)/5;
				System.out.println("Hasil Reamur : "+r);
				break;
				case 3:
				k = c + 273;
				System.out.println("Hasil Kelvin : "+k);
				break;
				case 4:
				System.exit(0);
				return;
				
				default:
				break;
			}

			answer = input.nextLine();
			
			// if(pilih == 1)
			// {
			// 	f = (9*c)/5+32;
			// 	System.out.println("Hasil Fahrenheit : "+f);
			// }
			// else if (pilih == 2) {
			// 	r = (4* c)/5;
			// 	System.out.println("Hasil Reamur : "+r);
			// }else if (pilih == 3) {
			// 	k = c + 273;
			// 	System.out.println("Hasil Kelvin : "+k);
			// }else{
			// 	System.out.println("pilihan hanya 3 ");
			// }
			// System.out.println("ingin convertsi yang lain : (y/n) ");
			// // userchoice = input.nextInt();
			// answer = input.nextLine();
		}
			catch(InputMismatchException e){

                System.err.println(e.toString());
            }
            catch(NullPointerException e){

                System.err.println(e.toString());
            }
            catch(Exception e){
                System.err.println(e.toString());
            }

            System.out.println("ulang atau tidak (Y/N)");
            answer = input.nextLine();


	}
	while( answer.toLowerCase().equals("y"));
}
}

