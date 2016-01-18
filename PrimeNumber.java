// Name  : Luthfi Fauzani Ahmad 
// NIM   : 1301140029
// Class : IF-38-09


import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Angka : ");
        int input = scan.nextInt();
        boolean prime = true;
        for (int i = 2; i < input; i++){
            if (input % i == 0){
                prime = false;
            }
        }
        if (prime == false){
            System.out.println(input + " bukan prima");
        }
        else if (prime == true){
            System.out.println(input + " adalah prima");
        }
    }
    
}


