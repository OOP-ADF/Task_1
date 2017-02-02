public class TemperatureConvert {

    public static void main(String[] args) {
        System.out.print("enter the temperature in Celsius: ");
        Scanner convert = new Scanner(System.in);
        int c = convert.nextInt();
        System.out.println("1.kelvin ");
        System.out.println("2.reamur ");
        System.out.println("3.fahrenheit ");
        System.out.println("enter the number: ");
        int choose = convert.nextInt();
        int temperature;
        
            if (choose == 1) {
                temperature = c+273;
                System.out.println("convert Celcius to Kelvin " + temperature +" degrees");
            }
            else if (choose == 2) {
                temperature = c*4/5;
                System.out.println("Convert Celcius to Reamur= " + temperature +" degrees");
            }
            else if (choose == 3) {
                temperature = (c*9/5)+32;
                System.out.println("Convert Celcius to Fahrenheit= " + temperature +" degrees");
            }
            else {
                System.out.println("choose only 1/2/3");
        }
    }
    
}
