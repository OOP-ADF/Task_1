import java.util.Scanner;

public class soalNilai {
    public static void main (String [] hady){
        String nama , nim ;
        char grade;
        final double n_tugas , n_uts , n_kuis , n_uas , n_akhir;
        Scanner input = new Scanner (System.in);
  
  
        System.out.print("Masukan nama : ");
        nama = input.nextLine();
        System.out.print("Masukan NIM : ");
        nim = input.nextLine();
        System.out.print("Nilai kuis : ");
        n_kuis = input.nextInt();
        System.out.print("Nilai uts : ");
        n_uts = input.nextInt();
        System.out.print("Nilai uas : ");
        n_uas = input.nextInt();
        n_akhir = (0.25 * n_kuis + 0.35 * n_uts + 0.40 * n_uas);
      
        if (n_akhir >= 85 && n_akhir <=100){
            grade = 'A';
        }
        else if (n_akhir > 75 && n_akhir < 84){
            grade = 'B';
        }
        else if (n_akhir > 65 && n_akhir < 74){
            grade = 'C';
        }
        else if (n_akhir > 50 && n_akhir < 64){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' ){
            System.out.println("\n"+nama+" NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    +"\n excellent");
        if  (grade == 'B' ){
            System.out.println("\n"+nama+" NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    +"\n very good");
            
        if  (grade == 'C' ){
            System.out.println("\n"+nama+" NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    +"\n good");
 
        if  (grade == 'D' ){
            System.out.println("\n"+nama+" NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    +"\n accepted");
        if  (grade == 'E' ){
            System.out.println("\n"+nama+" NIM "+nim+" memiliki nilai akhir "+n_akhir+" = ("+grade+")"+""
                    +"\n failed");
        }
        }
        }
        }
        }
    }
}

