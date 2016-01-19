import java.util.Scanner;

public class TemperatureConvert {

/*
* Created by 
* Name       : Dede Kiswanto
* Student ID : 1301140171
* Class      : IF-38-01
*/
    
    public static void main(String[] args){
        System.out.println("TemperatureConvert Exercise");
	
        Scanner scanInt = new Scanner(System.in);
        Scanner scanStr = new Scanner(System.in);
        
        int inputNum;
        int opt; 
        String askString;
        double tempConverted;
       
        while (true) { //Loop for the user if he/she want to convert again            
            System.out.print("Input Celcius Temperature : ");
            inputNum = scanInt.nextInt();
            
            System.out.print("Convert to : \n" + 
                    "1. Reamur \n" + 
                    "2. Fahrenheit \n" + 
                    "3. Kelvin \n" +
                    "Option :  "
            );
            
            opt = scanInt.nextInt();
            switch(opt) {
                case 1 :
                     tempConverted = (0.8) * inputNum; 
                     System.out.println("Result Temperature : " + tempConverted);
                     break;
                case 2 : 
                     tempConverted = (9/5) * inputNum + 32; 
                     System.out.println("Result Temperature : " + tempConverted);
                     break;
                case 3 : 
                    tempConverted = inputNum + 273; 
                    System.out.println("Result Temperature : " + tempConverted);
                    break;
                default : System.out.print("Wrong Choice!!");
            }
            
            System.out.print("Convert Again (Y / N) : ");
            askString = scanStr.nextLine();
            
            if("N".equals(askString.toUpperCase())){                
                // Not handling another input.
                // Using method equals() on string object to match input user.
                break;
                
            }
        }
    }
}