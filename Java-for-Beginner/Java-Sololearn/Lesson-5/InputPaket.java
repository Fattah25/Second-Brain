import java.util.Scanner;

public class InputPaket {
	
	public static void main(String[] args) {
		Scanner myVar = new Scanner(System.in);
		
		//Memasukkan karakter string
		System.out.print("Masukkan nama anda : ");
		String nama = myVar.nextLine();
		System.out.println("nama saya adalah " + nama);
		
		//Memasukkan karakter int
		int a, b, penjumlahan;
		System.out.println("Masukkan nilai a: "); a = myVar.nextInt();
		System.out.println("Masukkan nilai b: "); b = myVar.nextInt();
		penjumlahan = a + b;
		
		System.out.println("jadi penjumlahan a + b = " + penjumlahan);
		
		//Memasukkan karakter double
		double c, d, pembagian;
		System.out.println("Masukkan nilai c: "); c = myVar.nextDouble();
		System.out.println("Masukkan nilai d: "); d = myVar.nextDouble();
		pembagian = c / d;
		System.out.print("jadi pembagian c dan d adalah " + pembagian);
		
		
	}

}
