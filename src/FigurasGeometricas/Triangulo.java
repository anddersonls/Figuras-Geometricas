package FigurasGeometricas;

public class Triangulo extends FiguraGeometrica {
    public Triangulo(int numLados, String nome, float[] dimensoes) {
        super(numLados, nome, dimensoes);
    }
    
    @Override
    public float calcularArea() {
        float areaTriangulo, meioPerimetro;
        
        meioPerimetro = super.calcularPerimetro()/2;
        areaTriangulo = (float) Math.sqrt(meioPerimetro * (meioPerimetro - getDimensoes()[0]) * (meioPerimetro - getDimensoes()[1]) * (meioPerimetro - getDimensoes()[2]));
       
        return areaTriangulo;
    }
}