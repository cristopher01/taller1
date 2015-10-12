package taller1;

import javax.swing.JOptionPane;

public class Taller1 {

    	public static void main(String[] args) {
		int Num = Dato1();
		int[][] Arreglo = new int[Num][Num];
		AvisoConsola();
		Rellenar(Arreglo);
		Lectura(Arreglo);
	}

	public static int Dato1() {
		Boolean Cierre = true;
		int Eleccion = 0;
		do {
			try {
				Eleccion = Integer.parseInt(JOptionPane.showInputDialog(" >>>>>Generador de matrices<<<<< "
						+ "\n Ingrese el Numero de filas y columnas" + "\n que desea que tenga la matriz "));
				Cierre = false;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
			}
		} while (Cierre == true);
		return Eleccion;
	}

	public static int Random() {
		int Aleatorio = (int) Math.floor(Math.random() * 9);
		return Aleatorio;
	}

	public static void Rellenar(int[][] Arreglo) {
		for (int i = 0; i < Arreglo.length; i++) {
			for (int j = 0; j < Arreglo.length; j++) {
				Arreglo[i][j] = Random();
			}
		}
	}

	public static void Lectura(int[][] Arreglo) {
		for (int i = 0; i < Arreglo.length; i++) {
			for (int j = 0; j < Arreglo.length; j++) {
				System.out.print(" " + Arreglo[i][j]);
			}
			System.out.println();
		}

	}

	private static void AvisoConsola() {
		JOptionPane.showMessageDialog(null, "La matriz se rellanara y sera mostrada en consola");
	}
}