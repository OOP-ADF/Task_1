package Task_1;
public class TemperatureConvert {
double k,f,r;
    public void con (int a)
    {
        
     	k = a + 273;
	f = (9/5*a) + 32;
	r = (4*a)/5;
	System.out.println("Result in Kelvin 	 = " + k + " Kelvin");
	System.out.println("Result in Fahrenheit = " + f + " Fahrenheit");
	System.out.println("Result in Reamur	 = " + r + " Reamur");	   
    }
}
