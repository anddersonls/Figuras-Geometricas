package FigurasGeometricas;

public class Retangulo extends Quadrilatero{
	
	public Retangulo(int numLados, String nome, float[] dimensoes) {
		super(numLados, nome, dimensoes);
		if(dimensoes[0]!=dimensoes[2] || dimensoes[1] != dimensoes[3]){
        	System.err.println("Não é possível gerar um quadrilátero com as dimensões dadas!");
			System.exit(0);
        }
	}
	
}
