package FigurasGeometricas;

public class Quadrilatero extends FiguraGeometrica{
	public Quadrilatero(int numLados, String nome, float[] dimensoes) {
        super(numLados, nome, dimensoes);
        if(numLados!=4){ 
        	System.err.println("Não é possível gerar um quadrilátero de " + numLados + " lados!");
			System.exit(0);
        }
	}
    
	@Override
    public float calcularArea() {
        float areaQuadrilatero;
        
        areaQuadrilatero = (getDimensoes()[0] * getDimensoes()[1]);
       
        return areaQuadrilatero;
    }

}
