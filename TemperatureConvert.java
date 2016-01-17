// Muhammad Andika SM
// 1301140145
// IF 38-09

import java.util.Scanner;

public class TemperatureConvert {

    private double c,f,k,r;

    public TemperatureConvert(double num, String str) {
        switch ( str ) {
            case "Celcius" :
		this.c = num;
		break;
            case "Fahrenheit" :
		this.f = num;
		this.c = fahrenheitToCelcius(this.f);
		break;
            case "Kelvin" :
		this.k = num;
		this.c = kelvinToCelcius(this.k);
		break;
            case "Reamur" :
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
    
    public void outputSuhu () {
        System.out.println(this.c + "Celcius\t\t: ");
        System.out.println(this.r + "Rheamur\t\t: ");
        System.out.println(this.f + "Fahrenheit\t: ");
        System.out.println(this.k + "Kelvin\t\t: ");
    }
}