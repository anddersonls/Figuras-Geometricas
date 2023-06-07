package FigurasGeometricas;

public class Escaleno extends Triangulo{
	
	public Escaleno(int numLados, String nome, float[] dimensoes) {
        super(numLados, nome, dimensoes);
        if(dimensoes[0]==dimensoes[1] || dimensoes[0]==dimensoes[2] 
        		|| dimensoes[1]==dimensoes[2]) {
        	System.err.println("Não é possível gerar um triangulo escaleno com as dimensões dadas!");
			System.exit(0);
        }

    }

}
