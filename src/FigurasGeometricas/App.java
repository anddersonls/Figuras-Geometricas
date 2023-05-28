package FigurasGeometricas;
import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        float[] dimensoesTriangulo = {2.0f, 3.0f, 4.0f};
        float[] dimensoesQuadrado = {5.0f, 5.0f, 5.0f};
		
		figuras.add(new Equilatero(3, "Equilatero", 5.0F));
        figuras.add(new Isosceles(3, "Isosceles", dimensoesTriangulo));
        figuras.add(new Escaleno(3, "Escaleno", dimensoesTriangulo));
        figuras.add(new Quadrado(4, "Quadrado", 8.0f));
        figuras.add(new Retangulo(4, "Quadrado", dimensoesQuadrado));
        
        for(FiguraGeometrica item: figuras) {
        	System.out.println(item.getNome());
        }
        
        Equilatero equilatero = new Equilatero(3, "Roger", 5.0F);
        Quadrilatero quadrado = new Quadrado(4, "Vitor", 8.0F);
        
        compararPerimetro(equilatero, quadrado);
        compararArea(equilatero, quadrado);
	}
	
	public static void compararPerimetro(FiguraGeometrica f1, FiguraGeometrica f2) {
		float perimetroFigura1 = f1.calcularPerimetro();
        float perimetroFigura2 = f2.calcularPerimetro();
        
        System.out.println("Perímetro de " + f1.getNome() + ": " + perimetroFigura1);
        System.out.println("Perímetro de " + f2.getNome() + ": " + perimetroFigura2);
        if (perimetroFigura1 > perimetroFigura2) {
            System.out.println(f1.getNome() + " possui um perímetro maior que " + f2.getNome() + "!");
        } else if (perimetroFigura1 < perimetroFigura2) {
            System.out.println(f2.getNome() + " possui um perímetro maior que " + f1.getNome() + "!");
        } else {
            System.out.println("As figuras possuem perímetros iguais!");
        }

	}
	
	public static void compararArea(FiguraGeometrica f1, FiguraGeometrica f2) {
		float areaFigura1 = f1.calcularArea();
        float areaFigura2 = f2.calcularArea();
        
        System.out.println("Área de " + f1.getNome() + ": " + areaFigura1);
        System.out.println("Área de " + f2.getNome() + ": " + areaFigura2);
        if (areaFigura1 > areaFigura2) {
            System.out.println(f1.getNome() + " possui uma area maior que " + f2.getNome() + "!");
        } else if (areaFigura1 < areaFigura2) {
            System.out.println(f2.getNome() + " possui uma area maior que " + f1.getNome() + "!");
        } else {
            System.out.println("As figuras possuem perímetros iguais!");
        }

	}

}
