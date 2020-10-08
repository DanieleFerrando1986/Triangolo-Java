package triangolo;

public class Figura {
	
	protected static int lato;
	protected static int lato1;
	protected static int lato2;
	protected static int lato3;
	protected static int base; 
	protected static int altezza; 
	private int area; 
	private int perimetro;
	private int perimetroDue;
	
	public Figura(int lato, int lato1, int lato2, int lato3, int base, int altezza) {
		this.lato=lato;
		this.lato1=lato1;
		this.lato2=lato2;
		this.lato3=lato3;
		this.base=base;
		this.altezza=altezza;
	}
	
	public int getLato() {
		return this.lato;
	}
	
	public int getLatoUno() {
		return this.lato1;
	}
	
	public int getLatoDue() {
		return this.lato2;
	}
	
	public int getLatoTre() {
		return this.lato3;
	}
	
	public int getBase() {
		return this.base;
	}
	
	public int getAltezza() {
		return this.altezza;
	}
	
	public int getArea() {
		return this.area;
	}
	
	public int getPerimetro() {
		return this.perimetro;
	}
	
	public int getPerimetroDue() {
		return this.perimetroDue;
	}
	
	public void setLato(int nuovoLato) {
		this.lato=nuovoLato;
	}
	
	public void setLatoUno(int nuovoLatoUno) {
		this.lato1=nuovoLatoUno;
	}
	
	public void setLatoDue(int nuovoLatoDue) {
		this.lato2=nuovoLatoDue;
	}
	
	public void setLatoTre(int nuovoLatoTre) {
		this.lato3=nuovoLatoTre;
	}
	
	public void setBase(int nuovaBase) {
		this.base=nuovaBase;
	}
	
	public void setAltezza(int nuovaAltezza) {
		this.altezza=nuovaAltezza;
	}
	
	public void setArea(int nuovaArea) {
		this.area=nuovaArea;
	}
	
	public void setPerimetro(int nuovoPerimetro) {
		this.perimetro=nuovoPerimetro;
	}
	
	public void setPerimetroDue(int nuovoPerimetroDue) {
		this.perimetroDue=nuovoPerimetroDue;
	}
	
}
