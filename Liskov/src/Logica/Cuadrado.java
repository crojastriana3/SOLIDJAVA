package Logica;

public class Cuadrado implements Forma{
	private double tama�o;
	public Cuadrado() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Cuadrado(double tama�o) {
		super();
		this.tama�o = tama�o;
	}



	public double getTama�o() {
		return tama�o;
	}



	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}



	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return this.tama�o*this.tama�o;
	}

}
