package jana60;

public class Rettangolo implements Poligono{

	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza) throws Exception{
		super();
		this.base = base;
		this.altezza = altezza;
		validaRettangolo();
	}

	public int calcolaPerimetro() {
		int perimetro = base * 2 + altezza * 2;
		return perimetro;
	}
	
	public int calcolaArea() {
		int area = base * altezza;
		return area;
	}
	
	public void validaRettangolo() throws Exception {
		if (base <= 0 || altezza <= 0) {
			throw new Exception ("Si prega inserire dei dati maggiori di 0");
		}
	}
	
}
