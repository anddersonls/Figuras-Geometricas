package FigurasGeometricas;

public class Triangulo extends FiguraGeometrica {
    public Triangulo(float[] dimensoes) {
        super(3, "Triângulo", dimensoes);
    }

    @Override
    public void mostrarDimensoes() {
    	for (int i = 0; i < getDimensoes().length ; i++) {
    	    System.out.println("Lado " + i+1 + ": " + getDimensoes()[i]);
    	}

    }
        
    public float calcularArea() {
        float areaTriangulo, meioPerimetro;
        
        meioPerimetro = super.calcularPerimetro()/2;
        areaTriangulo = (float) Math.sqrt(meioPerimetro * (meioPerimetro - getDimensoes()[0]) * (meioPerimetro - getDimensoes()[1]) * (meioPerimetro - getDimensoes()[2]));
       
        return areaTriangulo;
    }
}