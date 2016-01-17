Alim Nuriqra A
1301144032
IF-38-02

import java.util.*;
public class ConverterSuhu {
   
    static double SuhuAwal;
    static char Awal;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celcius fromCelcius = new Celcius();
        Fahrenheit fromFahrenheit = new Fahrenheit();
        Reamur fromReamur = new Reamur();
        Kelvin fromKelvin = new Kelvin();
       
        double Fahrenheit, Kelvin,Celcius,Reamur;
        boolean valid=false;
        Scanner input = new Scanner(System.in);
       
        while(valid!=true)
        {
            System.out.println("Program Konversi Suhu");
            System.out.print("Masukkan suhu awal dan nilainya (D/F/R/K) (misal : 100 C):");
            SuhuAwal=input.nextDouble();
            Awal = input.next().charAt(0);
 
            switch(Awal){
                case 'C':
                    Reamur = fromCelcius.toReamur();
                    Fahrenheit = fromCelcius.toFahrenheit();
                    Kelvin = fromCelcius.toKelvin();
                    System.out.println("Suhu awal ="+SuhuAwal+" Celcius\nHasil:");
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Kelvin : "+Kelvin);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'F':
                    Celcius = fromFahrenheit.toCelcius();
                    Reamur = fromFahrenheit.toReamur();
                    Kelvin = fromFahrenheit.toKelvin();
                    System.out.println("Suhu awal ="+SuhuAwal+" Fahrenheit\nHasil:");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Kelvin : "+Kelvin);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'K':
                    Celcius = fromKelvin.toCelcius();
                    Reamur = fromKelvin.toReamur();
                    Fahrenheit = fromKelvin.toFahrenheit();
                    System.out.println("Suhu awal ="+SuhuAwal+" Kelvin\nHasil:");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Reamur : "+Reamur);
                    valid=true;
                    break;
                case 'R':
                    Celcius = fromReamur.toCelcius();
                    Fahrenheit = fromReamur.toFahrenheit();
                    Kelvin = fromReamur.toKelvin();
                    System.out.println("Suhu awal ="+SuhuAwal+" Reamur\nHasil:");
                    System.out.println("Celcius : "+Celcius);
                    System.out.println("Fahrenheit : "+Fahrenheit);
                    System.out.println("Kelvin : "+Kelvin);
                    valid=true;
                    break;
                default :
                    System.out.println("Masukkan suhu secara benar [C,F,K,R]");
            }
        }
    }
}

public class Celcius {
    double toFahrenheit(){
        //°F = °C × 1,8 + 32
        return (KonversiSuhu.SuhuAwal*1.8+32);
    }
    double toReamur(){
        //°Ré = °C × 0,8
        return (KonversiSuhu.SuhuAwal*0.8);
    }
    double toKelvin(){
        //K = °C + 273,15
        return (KonversiSuhu.SuhuAwal+273.15);
    }
}

public class Fahrenheit {
    double toReamur(){
        //°Ré = (°F - 32) / 2,25
        return ((KonversiSuhu.SuhuAwal-32)/2.25);
    }
    double toKelvin(){
        //K = (°F + 459,67) / 1,8
        return ((KonversiSuhu.SuhuAwal+459.67)/ 1.8);
    }
    double toCelcius(){
        //°C = (°F - 32) / 1,8
        return ((KonversiSuhu.SuhuAwal-32)/1.8);
    }
}

public class Kelvin {
    double toFahrenheit(){
        //°F = K × 1,8 - 459,67
        return (KonversiSuhu.SuhuAwal*1.8-459.67);
    }
    double toReamur(){
        //°Ré = (K - 273,15) × 0,8
        return ((KonversiSuhu.SuhuAwal-273.15)*0.8);
    }
    double toCelcius(){
        //°C = K - 273,15
        return (KonversiSuhu.SuhuAwal-273.15);
    }
}

public class Reamur {
    double toFahrenheit(){
        //°F = °Ré × 2,25 + 32
        return (KonversiSuhu.SuhuAwal*2.25+32);
    }
    double toKelvin(){
        //K = °Ré / 0,8 + 273,15
        return (KonversiSuhu.SuhuAwal/0.8+237.15);
    }
    double toCelcius(){
        //°C = °Ré / 0,8
        return (KonversiSuhu.SuhuAwal/0.8);
    }
}