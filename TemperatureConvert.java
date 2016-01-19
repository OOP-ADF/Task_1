// Name : Rizza Aulia Rahman
// Student ID : 1301144231
// Class : IF-38-01

import java.util.Scanner;

public class TemperatureConvert {
	public static void main (String[] args) {
		Scanner suhu;
			suhu = new Scanner (System.in);
    Scanner pilih;
      pilih = new Scanner (System.in);
    Scanner yesno;
      yesno = new Scanner (System.in);
		int pil;
      float p_inp;
		float inpSuhu;
    char yes;
    String status;
		System.out.print("Masukkan suhu (Celcius) : ");
    inpSuhu = suhu.nextFloat();
    p_inp = 5;
    do {
      System.out.println("1. Convert ke Celcius");
      System.out.println("2. Convert ke Reamur");
      System.out.println("3. Convert ke Fahrenheit");
      System.out.println("4. Convert ke Kelvin");
      System.out.println("");
      System.out.print("Masukkan pilihan : ");
      pil = pilih.nextInt();
      switch (pil) {
        case 1 :
          inpSuhu = (5/p_inp)*inpSuhu;
          p_inp = 5;
          break;
        case 2 :
          inpSuhu = (4/p_inp)*inpSuhu;
          p_inp = 4;
          break;
        case 3 :
          inpSuhu = ((9/p_inp)*inpSuhu) + 32;
          p_inp = 9;
          break;
        case 4 :
          inpSuhu = ((5/p_inp)*inpSuhu) + 273;
          p_inp = 5;
          break;
        default :
          System.out.println("Input salah");
          break;
      }
    System.out.println("");
    } while ((pil != 1) && (pil != 2) && (pil != 3) && (pil != 4));
		do {
      if (p_inp == 4) {
        status = "Reamur";
      } else if (p_inp == 5) {
        if ((inpSuhu - 273) < 0) {
          status = "Celcius";
        } else {
          status = "Kelvin";
        }
      } else {
          status = "Fahrenheit";
      }
      System.out.println("Temperatur "+inpSuhu+" "+status+".");
      System.out.print("Ingin convert lagi (y/n) : ");
      yes = yesno.next().charAt(0);
      if (yes == 'y') {
      do {
        System.out.println("1. Convert ke Celcius");
        System.out.println("2. Convert ke Reamur");
        System.out.println("3. Convert ke Fahrenheit");
        System.out.println("4. Convert ke Kelvin");
        System.out.println("");
        System.out.print("Masukkan pilihan : ");
        pil = pilih.nextInt();
        switch (pil) {
        case 1 :
          if (p_inp == 9){
            inpSuhu = (inpSuhu - 32)*(5/p_inp);
          } else if ((inpSuhu - 273) >= 0) {
            inpSuhu = inpSuhu - 273;
          } else if ((inpSuhu - 273) < 0) {
            inpSuhu = (5/p_inp)*inpSuhu;
          }
          p_inp = 5;
          break;
        case 2 :
          if (p_inp == 9){
            inpSuhu = (inpSuhu - 32)*(4/p_inp);
          } else if ((inpSuhu - 273) >= 0) {
            inpSuhu = ((4/p_inp)*(inpSuhu - 273));
          } else if ((inpSuhu - 273) < 0) {
            inpSuhu = (4/p_inp)*inpSuhu;
          }
          p_inp = 4;
          break;
        case 3 :
          if ((inpSuhu - 273) >= 0) {
            inpSuhu = (((inpSuhu - 273)*(9/p_inp)) + 32);
          }
          else {
            inpSuhu = ((9/p_inp)*inpSuhu) + 32;
          }
          p_inp = 9;
          break;
        case 4 :
          if (p_inp == 9) {
            inpSuhu = ((5/p_inp)*(inpSuhu - 32)) + 273;
          }
          if ((inpSuhu - 273 < 0)) {
            inpSuhu = ((5/p_inp)*inpSuhu) + 273;
          }
          p_inp = 5;
          break;
        default :
          System.out.println("Input salah");
          break;
        }
      } while ((pil != 1) && (pil != 2) && (pil != 3) && (pil != 4));
    }
    else if (yes == 'n') {
      break;
    } else {
      System.out.println("Pilihan salah");
    }
      System.out.println("");
  } while (yes != 'n');
  suhu.close();
  }
}
