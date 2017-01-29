
package Task_1;
public class IndexPoint {
int x;
    public void cek (int a,int b, int c)
    {
        x = ((35*a)/100) + ((40*b)/100) + ((25*c)/100);
	System.out.println("Your Final Score is : " + x);
	if ((x>= 85) && (x <= 100))
	{
		System.out.println("Excellent");
	}
	else if ((x>= 75) && (x <= 84))
	{
		System.out.println("Very Good");
	}
	else if ((x>= 65) && (x <= 74))
	{
		System.out.println("Good");
	}
	else if ((x>= 50) && (x <= 64))
	{
		System.out.println("Accepted");
	}
	else if (x <= 49)
	{
		System.out.println("Failed");
	}
    }
}