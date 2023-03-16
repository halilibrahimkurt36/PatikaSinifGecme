import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] dersler= {"Matematik","Fizik","Kimya","Türkçe","Müzik"};
		double mat = 0,fizik=0,kimya=0,turkce=0,muzik=0;
		double ort;
	
		String sonuc;
		
	
		try (Scanner giris = new Scanner(System.in)) {
			
			System.out.print("Lütfen "+dersler[0]+" dersinin notunu giriniz :");
			mat=giris.nextDouble();
			if(mat<0||mat>100) {
				System.out.println("Ders Notunuzu Belirtilen Aralıklarda Girmediniz.Bu Not Ortalamaya Dahil Edilmedi");
				mat=0;
			}
			
			
			System.out.print("Lütfen "+dersler[1]+" dersinin notunu giriniz :");
			fizik=giris.nextDouble();
			if(fizik<0||fizik>100) {
				System.out.println("Ders Notunuzu Belirtilen Aralıklarda Girmediniz.Bu Not Ortalamaya Dahil Edilmedi");
				fizik=0;
			}
			
			
			System.out.print("Lütfen "+dersler[2]+" dersinin notunu giriniz :");
			kimya=giris.nextDouble();
			if(kimya<0||kimya>100) {
				System.out.println("Ders Notunuzu Belirtilen Aralıklarda Girmediniz.Bu Not Ortalamaya Dahil Edilmedi");
				kimya=0;
			}
			
			
			System.out.print("Lütfen "+dersler[3]+" dersinin notunu giriniz :");
			turkce=giris.nextDouble();
			if(turkce<0||turkce>100) {
				System.out.println("Ders Notunuzu Belirtilen Aralıklarda Girmediniz.Bu Not Ortalamaya Dahil Edilmedi");
				turkce=0;
			}
			
			
			System.out.print("Lütfen "+dersler[4]+" dersinin notunu giriniz :");
			muzik=giris.nextDouble();
			if(muzik<0||muzik>100) {
				System.out.println("Ders Notunuzu Belirtilen Aralıklarda Girmediniz.Bu Not Ortalamaya Dahil Edilmedi");
				muzik=0;
			}
			
		}
		
		
		
		ort=(mat+fizik+kimya+turkce+muzik)/dersler.length;
		System.out.println("Derslerin ortalaması "+ ort);
		sonuc=ort>60? "Geçti" : "Kaldı";
		System.out.print("Okul Durumunuz : "+sonuc);
		
			
		
		
	

	
	

	}
	}


	


