package br.unicentro.acaddecomp;

public class TestaFigura {
	public static void main (String args[]){
		Figura f1 = new Circulo();
		Figura f2 = new Quadrado();
		Figura f3 = new Retangulo();
		System.out.printf("%.2f\n", f1.area(2.0));
		System.out.printf("%.2f\n", f2.area(5.0));
		System.out.printf("%.2f", f3.area(3.0));
	}
}
