import java.util.Scanner;

public class TUGAS1 {
    public static void main(String[] args) {
        int o;
        Scanner inputI=new Scanner(System.in);
        Scanner inputS=new Scanner(System.in);
        Scanner inputD=new Scanner(System.in);
        do
		{
        System.out.println("===MENU===");
        System.out.println("1.Prime Number");
        System.out.println("2.Index Point");
        System.out.println("3.Temperature Converter");
	System.out.println("4.Exit");
        System.out.print("choose ");
        o = inputI.nextInt();
        
        switch (o) {
            case 1:
                
                System.out.flush();
                int a,b;
                System.out.println("input number: ");
                Scanner input = new Scanner(System.in);
                a = input.nextInt();
                b = 0;
                for (int i=1; i<=a; i++){
                    if (a % i == 0)
                    {
                        b++;
                    }
                }   if (b==2) {
                    System.out.println("prime number");
                }
                else{
                    System.out.println("non-prime number");
                }   break;
            case 2:
                System.out.flush();
                double mid,end,quiz,Score;
                String index;
                System.out.print("Mid-term Score: ");
                mid=inputD.nextDouble();
                System.out.print("End-term Score: ");
                end=inputD.nextDouble();
                System.out.print("Quiz Score: ");
                quiz=inputD.nextDouble();
                Score=((0.3*mid)+(0.4*end)+(0.25*quiz));
                if (Score>=85 && Score<=100){
                    index="Excelent";}
                else if(Score>=75 && Score<=84){
                    index="Very Good";}
                else if(Score>=65 && Score<=74){
                    index="Good";}
                else if(Score>=50 && Score<=64){
                    index="Accepted";}
                else{ index="Failed";}
                System.out.print("Index : "+index);
                System.out.println();
                break;
            case 3:

                System.out.flush();
                int celcius, choose;
                double fah, kel, ream;
                System.out.print("Celcius: ");
                Scanner input1 = new Scanner(System.in);
                celcius = input1.nextInt();
                do{
                    System.out.println("Convert celcius to: ");
                    System.out.println("1. Fahrenheit ");
                    System.out.println("2. Kelvin ");
                    System.out.println("3. Reamur ");
                    System.out.println("4. Exit ");
                    
                    System.out.print("Choose: ");
                    Scanner input2 = new Scanner(System.in);
                    choose = input2.nextInt();
                    
                    switch(choose){
                        case 1:
                        {
                            fah = ((celcius*9/5)+32);
                            System.out.println("Result : " +fah+ " Fahrenheit");
                            System.out.println();
                            break;
                        }
                        case 2:
                        {
                            kel=(celcius+273);
                            System.out.println("Result :  " +kel+ " Kelvin");
                            System.out.println();
                            break;
                        }
                        case 3:
                        {
                            ream=(celcius*4/5);
                            System.out.println("Result : " +ream+ " Reamur");
                            System.out.println();
                            break;
                        }
                    }
                }
                while(choose<4);
                break;
		
            default:
                break;
		}
        }while(o<4);
    }
         
}

    
