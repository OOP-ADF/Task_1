import java.util.Scanner;
public class IndexPoint {
    public static void main(String[] args) {
        System.out.println("Index Nilai Akhir");
        System.out.println("_________________");
        System.out.print("Masukkan Nilai Quiz : ");
        Scanner nilaiqz = new Scanner(System.in);
        float nilaiquiz = nilaiqz.nextFloat();
        
        System.out.print("Masukkan Nilai UTS : ");
        Scanner nilaius = new Scanner(System.in);
        float nilaiuts = nilaius.nextFloat();
        
        System.out.print("Masukkan Nilai UAS : ");
        Scanner nilaias = new Scanner(System.in);
        float nilaiuas = nilaias.nextFloat();
        
        float totalquiz = ((25*nilaiquiz)/100);
        float totaluts = ((35*nilaiuts)/100);
        float totaluas = ((40*nilaiuas)/100);
        float totalnilai = (totalquiz+totaluts+totaluas);
        
        if (totalnilai >= 85){
            String grade = "Excellent";
            System.out.println("Total nilai: "+totalnilai+" Index = "+grade);
        }
        else if (totalnilai >= 75){
            String grade = "Very Good";
            System.out.println("Total nilai: "+totalnilai+" Index = "+grade);
        }
        else if (totalnilai >= 65){
            String grade = "Good";
            System.out.println("Total nilai: "+totalnilai+" Index = "+grade);
        }
        else if (totalnilai >= 50){
            String grade = "Accepted";
            System.out.println("Total nilai: "+totalnilai+" Index = "+grade);
        }
        else if (totalnilai >= 0){
            String grade = "Failed";
            System.out.println("Total nilai: "+totalnilai+" Index = "+grade);
        }
    }
}