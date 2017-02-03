import java.util.Scanner;

public class CobaPrime {

    public static void main(String[] args) {
        int x, y;
        int z = 0;
        Scanner cin = new Scanner(System.in);

        System.out.print("Inputkan Angka : ");
        x = cin.nextInt();
        for (y = 1; y <= x; y++) {
            if (x % y == 0) {
                z = z + 1;
            }
        }
        if (z == 2) {
            System.out.println(+x + " Adalah Bilangan Prima");
        } else {
            System.out.println(+x + " Bukan Bilangan Prima")
        }
    }

}

