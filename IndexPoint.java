// Irvan Nur Apendi 1301154208 IF-39-12
public class IndexPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Quiz : ");
        int nilaiquiz = input.nextInt();
        System.out.print("Masukkan Nilai UTS : ");
        int nilaiuts = input.nextInt();
        System.out.print("Masukkan nilai UAS : ");
        int nilaiuas = input.nextInt();
        
        double nilaiakhir = ((0.25*nilaiquiz) + (0.35*nilaiuts) + (0.4*nilaiuas));
        if (nilaiakhir >= 85 & <= 100) 
        {
            System.out.print("Grade = Excellent");
        }
        else if (nilaiakhir >= 75 & <= 84)
        {
            System.out.print("Grade = Very Good");
        }
        else if (nilaiakhir >= 65 & <= 74)
        {
            System.out.print("Grade = Good");
        }
        else if (nilaiakhir >= 50 & <= 64)
        {
            System.out.print("Grade = Accepted");
        }
        else if (nilaiakhir >= 0 & <= 49)
        {
            System.out.print("Grade = Failed");
        }
    }
}
