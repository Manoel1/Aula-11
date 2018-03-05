package Exercicio;

public class Losangolo extends Poligono {

	public Losangolo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return (this.getBase() * this.getAltura());
	}
	
	@Override
	public double perimetro() {
		return this.getBase()*4;
	}
}
