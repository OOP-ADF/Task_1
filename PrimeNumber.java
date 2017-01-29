package Task_1;
public class PrimeNumber {
int x;
    public void cek (int a)
    {
        x = 0;
        for (int y = 1; y <= a; y++)
        {
            if (a % y == 0)
            {
                x++;
            }
        }
        if (x == 2)
        {
            System.out.println ("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}