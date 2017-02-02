public class PrimeNumber {
    public static void main(String[] args) {
        System.out.print("Masukkan Angka: ");
        Scanner angka = new Scanner(System.in);
        int a = angka.nextInt();
        int counter = 0;
        for (int i = 2; i < a; i++) {
            if(a % i == 0){
                counter++;
            }
        }
        if(a > 0 && counter == 0){
            System.out.println("angka " +a+ " adalah Bilangan Prima");
        }
        else {
            System.out.println("angka " +a+ " bukan Merupakan Bilangan Prima");
        }    
    }
        
}

