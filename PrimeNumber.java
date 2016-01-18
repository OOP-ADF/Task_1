
/* 
Kevin Prakarsa B R (1301144169)
IF-38-09
*/

import java.util.Scanner;
public class kasusPrima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int awl, akhr, bil;  
        System.out.println("Prime Number");
        System.out.print("Masukkan batas awal\t: "); awl=in.nextInt();
        System.out.print("Masukkan batas akhir\t: "); akhr=in.nextInt();
        System.out.printf("Bilangan prima dari %d sampai %d adalah \n", awal, akhir);
        int ang=awl;
        while (ang <= akhr) {
            int tmp = 0;
            for (int bagi = 2; bagi < ang; bagi++) {
                if (ang%bagi==0) {
                    tmp=1;
                }
            }
            if (tmp != 1) {
                System.out.println(ang); 
                }
            ang++;
        }
    }
}
