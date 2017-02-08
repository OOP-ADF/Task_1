package TUGASPBO;

import java.util.Scanner;

/**
 *
 * @author Ergandhi Yudha Kurniawan 1301154147
 */
public class No2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner (System.in);
        System.out.print("Masukkan Nilai Kuis  : ");
        int kuis = Input.nextInt();
        System.out.print("Masukkan Nilai UTS   : ");
        int uts = Input.nextInt();
        System.out.print("Masukkan Nilai UAS   : ");
        int uas = Input.nextInt();
         
        int hasil;
        hasil = (kuis*25)/100;
        hasil = hasil+(uts*35/100);
        hasil = hasil+(uas*40/100);
        
        if (hasil >= 85) 
        {
            System.out.println("excellent");
        } 
        else
            if (hasil >= 75) 
            {
                System.out.println("very good");
            } 
            else 
                if (hasil >= 65) 
                {
                    System.out.println("good");
                }
                else 
                    if (hasil >= 50)
                    {
                        System.out.println("accepted");
                    }
                    else 
                    {
                        System.out.println("failed");
                    }
                            
    }
}

