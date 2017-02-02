import java.util.Scanner;
public class soalBilPrima {
    public static void main(String[] args) {
Scanner masukan = new Scanner (System.in);
System.out.println("Masukan sebuah bilangan :");
int bil = masukan.nextInt();
boolean prima = true;
for (int i=2; i<bil; i++){
    
if ((bil % i) == 0) {

prima = false; break;

    }
}
 if (prima)

System.out.println(bil + " merupakan bilangan PRIMA ");

else

System.out.println(bil + " bukan merupakan bilangan PRIMA ");
}
}

