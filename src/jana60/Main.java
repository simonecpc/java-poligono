package jana60;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Calcoliamo Perimetro ed Area del Quadrato:");
			int l;
			System.out.println("Inserire lato:");
			l = Integer.parseInt(scan.nextLine());
			
			Quadrato q = new Quadrato(l);
			
			System.out.println("Perimetro = " + q.calcolaPerimetro());
			System.out.println("Area = " + q.calcolaArea());
		} catch (NumberFormatException e) {
			System.out.println("Inserisci un numero valido");
			System.out.println(e.getMessage());
		}catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
		try {
			System.out.println("Calcoliamo Perimetro ed Area del Rettangolo:");
			int b;
			System.out.println("Inserire base:");
			b = Integer.parseInt(scan.nextLine());
			int h;
			System.out.println("Inserire altezza:");
			h = Integer.parseInt(scan.nextLine());
			Rettangolo r = new Rettangolo(b,h);
			
			System.out.println("Perimetro = " + r.calcolaPerimetro());
			System.out.println("Area = " + r.calcolaArea());
		}catch (NumberFormatException e) {
			System.out.println("Inserisci un numero valido");
			System.out.println(e.getMessage());
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}
	
}
