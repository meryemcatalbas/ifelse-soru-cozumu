package ornekCozumu;

import java.util.Scanner;

public class Sorucozumu_ifelse2 {

public static void main(String[] args) {
		   /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		Scanner scan= new Scanner(System.in);
		System.out.print("Lutfen haftanin gun isimlerinden birinin ilk harfini giriniz");
char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		
		if (ilkHarf=='P') {
			System.out.print("Pazar, Pazartesi veya Persembe");
		}
		if (ilkHarf=='S') {
			System.out.print("Sali");
		}
		if (ilkHarf=='C') {
			System.out.print("Carsamba, Cuma veya Cumartesi");
		}
		
		if (ilkHarf!='P' || ilkHarf!='S' ||ilkHarf!='C') {
			System.out.print("\n Gecersiz harf girdiniz \n Lutfen gun isimlerinden birinin basharfini yazin");
			scan.close();
	}
}
}
