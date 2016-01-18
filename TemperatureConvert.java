// Muhammad Andika SM
// 1301140145
// IF 38-09


import java.util.Scanner;

public class TemperatureConvert {

    private double c,f,k,r;

    public TemperatureConvert(double num, String str) {
        switch ( str ) {
            case "celcius" :
		this.c = num;
		break;
            case "fahrenheit" :
		this.f = num;
		this.c = fahrenheitToCelcius(this.f);
		break;
            case "kelvin" :
		this.k = num;
		this.c = kelvinToCelcius(this.k);
		break;
            case "rheamur" :
		this.r = num;
		this.c = rheamurToCelcius(this.r);
		break;
            default :
		System.out.println("Type no present");
		break;
	}
        this.f = celciusToFahrenheit(this.c);
        this.k = celciusToKelvin(this.c);
        this.r = celciusToRheamur(this.c);
    }
    
    private double kelvinToCelcius(double num) {
        return num - 273.15;
    }
    
    private double fahrenheitToCelcius(double num) {
        return (num - 32) * 5 / 9; 
    }
    
    private double rheamurToCelcius(double num) {
        return num * 5 /  4;
    }
    
    private double celciusToKelvin(double num) {
        return num + 273.15;
    }
    
    private double celciusToFahrenheit(double num) {
        return num * 9 / 5 + 32;
    }
    
    private double celciusToRheamur(double num) {
        return num * 4 / 5;
    }
    
    public void outputTemperature () {
        System.out.println("Celcius\t\t: " + this.c);
        System.out.println("Rheamur\t\t: " + this.r);
        System.out.println("Fahrenheit\t: " + this.f);
        System.out.println("Kelvin\t\t: " + this.k);
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Temperature Converter");
        System.out.println("ex : 34 fahrenheit");
        
        System.out.print("insert temperature : ");
        TemperatureConvert tc = new TemperatureConvert(sc.nextDouble(),sc.next());
        
        tc.outputTemperature();	
    }
    
}