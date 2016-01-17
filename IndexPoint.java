Alim Nuriqra A
1301144032
IF-38-02

import javax.swing.*;
public class IndexPoint{
	public static void main(String[]args){
		double na;
		char index;

		int quiz=Integer.valueOf(JOptionPane.showInputDialog(“Masukan Nilai Quiz=”));
		int uts=Integer.valueOf(JOptionPane.showInputDialog(“Masukan Nilai UTS=”));
		int uas=Integer.valueOf(JOptionPane.showInputDialog(“Masukan Nilai UTS=”));

		na = (quiz*0.25)+(uts*0.35)+(uas*0.4);
		if (na>=85 && na<=100)
			index=’excelent’;
			else
			if (na>=75 && na<=84)
				index=’Very good’;
				else
				if (na>=65 && na<=74)
					index=’good’;
					else
					if (na>=50 && na<=64)
						index=’accepted’;
						else
						index=’Failed’;

	System.out.println(“Nilai Quiz  =”+quiz);
	System.out.println(“Nilai UTS   =”+uts);
	System.out.println(“Nilai UAS =”+uas);
	System.out.println(“Nilai Akhir =”+na);
	System.out.println(“Index  =”+index);
}
}
