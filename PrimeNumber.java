/* 
Sulistiyo Tri Raharjo 
1301144329
IF-38-09
*/
 
 
public class PrimeNumber {

 
    public static void main(String[] args) {
        int x1;
        int x2;
        int x3;
        Scanner angka = new Scanner(System.in); 
        z = 0;
        System.out.println("Masukkan Bilangan yang Ingin Dicek : ");
        x1 = angka.nextInt();
        
        for (x2=1;x2<=x1;x2++)
        {
            if (x1%x2 == 0)
            {
                x3++;
            }
        }
        
        if (x3 == 2)
        {
            System.out.println("Bilangan Prima");
        }
        else
        {
            System.out.println("Bukan Bilangan Prima");
        }
    } 
}

