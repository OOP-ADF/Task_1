public class TemperatureConvert {
	public static void main(String[] args) {
		System.out.println("Masukkan suhu dalam skala celcius= ");
		Scanner kon = new Scanner(System.in);
		int c = kon.nextInt();
		System.out.println("1. Kelvin ");
		System.out.println("2. Reamur ");
		System.out.println("3. Farenheit ");
		System.out.println("Pilih Skala= ");
		int pilih = kon.nextInt();
		int temperature;
		
		if(pilih == 1) {
			temperature = c+273;
			System.out.println(temperature + " derajat Kelvin.");
		}
		else if(pilih == 2) {
			temperature = c*4/5;
			System.out.println(temperature + " derajat Reamur.");
		}
		else if(pilih == 3) {
			temperature = (c*9/5)+32;
			System.out.println(temperature + " derajat Farenheit.");
		}
	}
}