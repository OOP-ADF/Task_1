
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        
        int numb , n ,i, temp;
        Scanner apn = new Scanner (System.in);
        System.out.println("Input Number : ");
        numb = apn.nextInt();
        temp=0;
        
        for (i=1; i<=numb ; i++){
            if (numb % i == 0) {
                   temp+=1;
        }
        }
        if (temp==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
        
    
  
}
}
