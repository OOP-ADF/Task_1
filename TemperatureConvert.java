import java.util.Scanner;
public class TempConvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int option = 1;
        float hasil;
        Scanner input = new Scanner (System.in);
        System.out.println("Input Suhu (Celcius): ");
        float n = input.nextInt();
        
        
        while (option > 0 & option <4){
                System.out.println("Pilih Menu: ");
                System.out.println("1. Fahrenheit");
                System.out.println("2. Kelvin");
                System.out.println("3. Reamur");
                System.out.println("0. Keluar");
                option = input.nextInt();
            
            switch(option){
                case 1 : 
                    hasil = (n*9/5 + 32);
                    System.out.println(n+" Celcius = "+hasil+" Fahrenheit\n");
                    break;
                case 2 :
                    hasil = (n+273);
                    System.out.println(n+" Celcius = "+hasil+" Kelvin\n");
                    break;
                case 3 :
                    hasil = (n*4/5);
                    System.out.println(n+" Celcius = "+hasil+" Reamur\n");
                    break;
            }
        }
    }
    
    
}