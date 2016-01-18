// Agung Suhendar - 1301140279 - IF3809

public class TemperatureConvert {
	public static void main(String[] args) {
		System.out.println("Daftar konversi ");
		System.out.println("1.Rearmur");
		System.out.println("2.Farenheit");
		System.out.println("3.Kelvin");
		int c;
		int p;
		Scanner n = new Scanner(System.in);
		
		System.out.println("Masukkan pilihan : ");
		p = n.next();
		System.out.println("Masukkan derajat celcius : ");
		c = n.next();
		
		switch (p) {
			case 1 : System.out.println(c*(4/5));
						break;
			case 2 : System.out.println((c*(9/5))+32);
						break;
			case 3 : System.out.println(c + 273);
						break;
		}
	}
}