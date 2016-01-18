/*
 I Nyoman Tri Budhi Palantra
 1301140089
 IF 38 09
 */

public class PrimeNumber {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner input = new Scanner(System.in);
        
        z = 0;
        System.out.print("Input Number : ");
        x = input.nextInt();
        
        for (y=1;y<=x;y++)
        {
            if (x%y == 0)
            {
                z++;
            }
        }
        
        if (z == 2)
        {
            System.out.println("The number that you input is a Prime Number");
        }
        else
        {
            System.out.println("The number that you input is not a Prime Number");
        }
    } 
}
