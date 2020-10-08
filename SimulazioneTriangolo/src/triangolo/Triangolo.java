package triangolo;

public class Triangolo extends Figura {
	
	public static void main(String args[]) {
		Triangolo t=new Triangolo(altezza, base, lato, lato1, lato2, lato3);
		
		t.setBase(8);
		t.setAltezza(3);
		t.area();
		System.out.println("Area: (" + t.getBase() + "*" + t.getAltezza() + ")/" + 2 + "=" + t.getArea());
		
		t.setLatoUno(9);
		t.setLatoDue(3);
		t.setLatoTre(1);
		t.perimetro();
		System.out.println("Perimetro: " + t.getLatoUno() + "+" + t.getLatoDue() + "+" + t.getLatoTre() + "=" + t.getPerimetro());
		
		t.setLato(4);
		t.perimetroDue();
		System.out.println("Perimetro due: " + t.getLato() + "*" + 3 + "=" + t.getPerimetroDue());
	}

	public Triangolo(int lato, int lato1, int lato2, int lato3, int base, int altezza) {
		super(lato, lato1, lato2, lato3, base, altezza);
	}
	
	public void area() {
		setArea((getBase()*getAltezza())/2);
	}
	
	public void perimetro() {
		setPerimetro(getLatoUno()+getLatoDue()+getLatoTre());
	}
	
	private void perimetroDue() {
		setPerimetroDue(getLato()*3);
	}

}
