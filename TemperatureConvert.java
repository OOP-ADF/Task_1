import java.util.Scanner;
public class TemperatureConvert {
	public static void main(String[] args) {
		double c,h;
		char pil;
		Boolean isLoop=true;
		Scanner input=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		while (isLoop) {
			System.out.print("Enter a number : ");
			c = input.nextDouble();
			System.out.print("Convert to ([F]ahrenheit,[R]eamur,[K]elvin) : ");
			pil = input2.next().charAt(0);
			if (pil=='f'||pil=='F') {
				h=c*1.8+32;
				System.out.println("Result = "+h+" F");
			}
			else if (pil=='r'||pil=='R') {
				h=c*0.8;
				System.out.println("Result = "+h+" R");
			}
			else if (pil=='k'||pil=='K') {
				h=c+273.15;
				System.out.println("Result = "+h+" K");
			}
			else {
				System.out.println("Invalid command");
			}
			System.out.print("Do you want to restart (Y/N) : ");
			pil = input2.next().charAt(0);
			if (pil=='y'||pil=='Y') {
				isLoop=true;
			}
			else {
				isLoop=false;
			}
		}
	}
}