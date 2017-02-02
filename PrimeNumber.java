public class PrimeNumber {
	public static void main (String[] args) {
		System.out.print("Input Bilangan: ");
        Scanner cin = new Scanner(System.in);
        int i = cin.nextInt();
        int counter = 0;
        for (int j = 2; j < i; j++) {
            if(i % j == 0){
                counter++;
            }
        }
        if(i > 0 && counter == 0){
            System.out.println("Merupakan Bilangan Prima");
        }
        else {
            System.out.println("Bukan Merupakan Bilangan Prima");
    }
	}
}