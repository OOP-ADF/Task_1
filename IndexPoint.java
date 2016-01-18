// Name  : Luthfi Fauzani Ahmad 
// NIM   : 1301140029
// Class : IF-38-09

import java.util.Scanner;


public class IndexPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double z;
        double w;
        System.out.print("Nilai UTS	: ");
        x = input.nextInt();
        System.out.print("Nilai UAS	: ");
        y = input.nextInt();
        System.out.print("Nilai Quiz	: ");
        z = input.nextInt();
        w = x/100*35 + y/100*40 + z/100*25;
        if (w >= 85) 
                System.out.println("Grade : Excellent");
        else if ((w >= 75) && (w <= 84))
                System.out.println("Grade : Very Good");
        else if ((w >= 65) && (w <= 74))
                System.out.println("Grade : Good");        
        else if ((w >= 50) && (w <= 64))
                System.out.println("Grade : Accepted");
        else if ((w >= 0) && (w <= 49))
                System.out.println("Grade : Failed");        
    }
    
}

