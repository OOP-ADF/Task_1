// Irvan Nur Apendi IF-39-12 1301154208
public class ProgramPrima {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan : ");
		int i = 0;
        int bilangan = input.nextInt();
        for (int j = 1; j < bilangan; j++) {
            if (bilangan % j == 0) 
            {
                i = i+1;
            }
        }
        if (i == 1) 
        {
            System.out.println("Bilangan Prima");
        }
        else
        {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
