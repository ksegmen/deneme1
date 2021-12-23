package day07_IfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		
		  /*
         * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
         * ve o harfle baslayan gun isimlerini yazdirin 
            Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
            ilkHarf=S output = “Sali”
         *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
         */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lutfenn gun isimlerinden birinin ilk harfini yaziniz ");
		// kullanicinin girdigi verinin tamamini kucuk harf veya buuyuk harf yapabiliriz 
		// scan.next() ten sonra touppercase yazarsak kelimeyi buyuk harfe 
		// to lowercase yazarsak kelimenin tamamini kucuk harfe cevirmis oluruz
		

		char ilkHarf= scan.next().toUpperCase().charAt(0);
		if (ilkHarf=='P') {
			System.out.println("Pazar, Pazartesi veya Persembe");

		}
		if (ilkHarf=='S') {
			System.out.println("Sali");
			
		}
		
		if (ilkHarf=='C') {
			System.out.println("Carsamba,Cuma,Cumartesi");
	
	}
	// kullanici CarSamBa, carsamba CARSAMBA ......yazabilir 
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
			System.out.println("gecersiz harf girdiniz.Lutfen gun isimlerinden birinin basharfini yazin");
	
	}
}
}