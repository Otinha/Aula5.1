import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		
		ArrayList <Figura2D> figura = new ArrayList<>();
		figura.add(new Quadrado(5));
		figura.add(new Triangulo(4, 3));
		figura.add(new Losango(4, 8));
		figura.add(new Retangulo(7, 2));
		figura.add(new Circulo(4));
		figura.add(new Trapezio(8, 3, 4, 3));
		
		System.out.println("-o-o-o-o-o-o-o-o- Figuras 2D -o-o-o-o-o-o-o-o-o-");
		for (Figura2D fig:figura) {
			System.out.println("A área da figura é: "  + fig.area() + "cm²");
			
			if (fig instanceof Diagonal) {
				System.out.println("E sua diagonal vale: " + ((Diagonal)fig).calculaDiagonal());
				System.out.println("------------------------");
			} else {
				System.out.println("------------------------");
			}
		}
		System.out.println("-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-o-");
	}
}
