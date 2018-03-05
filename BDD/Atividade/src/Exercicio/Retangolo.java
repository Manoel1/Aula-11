package Exercicio;

public class Retangolo extends Poligono implements Diagonal {
	
	public Retangolo(double base, double altura) {
		super (base,altura);
		}
	@Override
	public double area() {
		return (this.getBase() * this.getAltura());
	}
	
	@Override
	public double CalcDiag() {
		return 0;
	}
	
	@Override
	public double perimetro() {
		return (this.getBase()*2) + (this.getAltura()*2);
	}
}
 
	

