package FigurasGeometricas;

public class Quadrilatero extends FiguraGeometrica{
	public Quadrilatero(int numLados, String nome, float[] dimensoes) {
        super(numLados, nome, dimensoes);
	}
	
    /*@Override
    public void mostrarDimensoes() {
    	for (int i = 0; i < getDimensoes().length ; i++) {
    	    System.out.println("Lado " + i+1 + ": " + getDimensoes()[i]);
    	}
    } */
        
    public float calcularArea() {
        float areaQuadrilatero;
        
        areaQuadrilatero = (getDimensoes()[0] * getDimensoes()[1]);
       
        return areaQuadrilatero;
    }

}
