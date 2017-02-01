import java.util.Scanner;

/**
 *
 * @author Adli Rachman
 */
public class Temperature {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hello World");
        double c,f,r,k,x;
        int n;
      
        c = 0, f = 0, r = 0, k = 0, n = 0,x = 0;
        Scanner in = new Scanner(System.in);
        while (x != 2){  
        
        System.out.print("Masukkan suhu dalam skala Celcius: ");
        c = in.nextInt();
        System.out.println("1. Fahreinheit ");
        System.out.println("2. Reamur");
        System.out.println("3. Kelvin");
        System.out.print("Konversi ke (1/2/3): ");
         
            n = in.nextInt();
            if (n == 1){
                f = (1.8*c);
                f = f + 32;
                System.out.println(c+" C = "+f+" F");
            }
            else if (n == 2){
                r = (0.8*c);
                System.out.println(c+" C = "+r+" R");
            }
            else if (n == 3){
                k = (c+273);
                System.out.println(c+" C = "+k+" K");
            }
            System.out.println("Apakah anda ingin konversi ke derajat lain? 1.Ya 2. Tidak");
            x = in.nextInt();
            System.out.println();
        }