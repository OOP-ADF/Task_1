import java.util.Scanner;
public class IndexPoint {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inputNilai = new Scanner(System.in);
        System.out.print("Masukkan Nilai UTS : ");
        float uts = inputNilai.nextFloat();
        System.out.print("Masukkan Nilai UAS : ");
        float uas = inputNilai.nextFloat();
        System.out.print("Masukkan Nilai KUIS : ");
        float kuis = inputNilai.nextFloat();
                
        float nA = (float) ((0.35*uts)+(0.4*uas)+(0.25*kuis));
        
        if (nA >= 85){
            String grade = "Excellent";
            System.out.println("Score =  "+nA+" , Grade = "+grade);
        }
        else if (nA >= 75){
            String grade = "Very Good";
            System.out.println("Score =  "+nA+" , Grade = "+grade);
        }
        else if (nA >= 65){
            String grade = "Good";
            System.out.println("Score =  "+nA+" , Grade = "+grade);
        }
        else if (nA >= 50){
            String grade = "Accepted";
            System.out.println("Score =  "+nA+" , Grade = "+grade);
        }
        else if (nA >= 0){
            String grade = "Failed";
            System.out.println("Score =  "+nA+" , Grade = "+grade);
        }
    }
    
}
//Akhmad Fadilah Ramadhan 1301140222 IF-38-02