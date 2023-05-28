package FigurasGeometricas;

public class Quadrado extends Quadrilatero{
	
	public Quadrado(int numLados, String nome, float lado) {
		super(numLados, nome, new float[]{lado, lado, lado, lado});
	}
}
