import java.util.Scanner;
/**
 * Hardiyan Ichsan Gunawan
 * 1301154138
 * IF 39 12
 * @author Harude
 */
public class TemperatureConvert {
    public static void main(String[] args) {
        int m;
        double c,conv;
        Scanner cin = new Scanner(System.in);
        m=0;
        conv = 0;
        while (m != 4){
            System.out.println("==================");
            System.out.println("| 1. C to F      |");
            System.out.println("| 2. C to Re     |");
            System.out.println("| 3. C to K      |");
            System.out.println("| 4. Exit        |");
            System.out.println("==================");
            System.out.print("Choose Menu: ");
            m = cin.nextInt();
            System.out.println("Input Celcius: ");
            c = cin.nextDouble();
            switch (m){
                case 1:
                    conv = (c * (9/5)) + 32;
                case 2:
                    conv = c * (4/5);
                case 3:
                    conv = c + 273.15;
            }
            System.out.println("Convert = "+ conv);
            System.out.println("");
        }
    }
}
