package jana60;

public class Quadrato implements Poligono{

	int lato;
	
	public Quadrato(int lato) throws Exception{
		super();
		this.lato = lato;
		validaRettangolo();
	}

	public int calcolaPerimetro() {
		int perimetro = lato * 4;
		return perimetro;
	}
	
	public int calcolaArea() {
		int area = lato * lato;
		return area;
	}
	
	public void validaRettangolo() throws Exception {
		if (lato <= 0) {
			throw new Exception ("Si prega inserire dei dati maggiori di 0");
		}
	}
	
}
