package FigurasGeometricas;

public class Quadrilatero extends FiguraGeometrica{
	public Quadrilatero(int numLados, String nome, float[] dimensoes) {
        super(numLados, nome, dimensoes);
	}
    
	@Override
    public float calcularArea() {
        float areaQuadrilatero;
        
        areaQuadrilatero = (getDimensoes()[0] * getDimensoes()[1]);
       
        return areaQuadrilatero;
    }

}
