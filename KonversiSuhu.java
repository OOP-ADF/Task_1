import java.util.Scanner;
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("KONVERSI SUHU");
	System.out.println("Menu: ");
        System.out.println("1. Celcius -> Fahrenheit");
	System.out.println("2. Celcius -> Reamur");        
	System.out.println("3. Celcius -> Kelvin");
	System.out.println("4. Exit");
	Scanner inputan = new Scanner(System.in);
	System.out.print("Pilih: ");
	int pilih =inputan.nextInt();
	switch (pilih){
	case 1:
		System.out.println("Celcius -> Fahrenheit");
		Scanner input = new Scanner (System.in);
            	System.out.print("Celcius: "); 
	    	int celcius = input.nextInt();
            	int hasil = (int) ((celcius*1.8)+32);
            	System.out.println("Fahrenheit: "+hasil);
		break;
	case 2:
		System.out.println("Celcius -> Reamur");
		Scanner input2 = new Scanner (System.in);
            	System.out.print("Celcius: "); 
            	int celcius2 = input2.nextInt();
            	int hasil2 = (int) (celcius2*0.8);
            	System.out.println("Reamur: "+hasil2);
		break;
	case 3:
		System.out.println("Celcius -> Kelvin");
		Scanner input3 = new Scanner (System.in);
            	System.out.print("Celcius: "); 
            	int celcius3 = input3.nextInt();
            	int hasil3 = (int) (celcius3+273);
            	System.out.println("Fahrenheit: "+hasil3);
        	break;
	case 4:
		System.exit(0);
	default:
		System.out.println("Inputan salah!!");
	}
    }
}