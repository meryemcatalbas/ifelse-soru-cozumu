package ornekCozumu;

import java.util.Scanner;

public class Sorucozumu_ifelse3 {

	public static void main(String[] args) {
		   // Soru 1) Kullanicidan bir tamsayi isteyin 
          //ve sayinin tek veya cift oldugunu yazdirin
		
Scanner scan=new Scanner(System.in);
System.out.println("bir tamsayi giriniz" );
int sayi=scan.nextInt();

if (sayi%2==0) {
	System.out.println("girdiginiz sayi cift sayidir");
	
}
if (sayi%2==1) {
	System.out.println("girdiginiz sayi tek sayidir");
}
scan.close();
	}
	
}
