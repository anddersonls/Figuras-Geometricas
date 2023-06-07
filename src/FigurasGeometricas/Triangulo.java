package FigurasGeometricas;

public class Triangulo extends FiguraGeometrica {
    public Triangulo(int numLados, String nome, float[] dimensoes) {
        super(numLados, nome, dimensoes);
        if(numLados!=3) { 
        	System.err.println("Não é possível gerar um triangulo de " + numLados + " lados!");
			System.exit(0);
        }else if(dimensoes[0]+dimensoes[1]<=dimensoes[2] || dimensoes[0]+dimensoes[2]<=dimensoes[1] 
        		|| dimensoes[1]+dimensoes[2]<=dimensoes[0]) {
        	System.err.println("Não é possível gerar um triangulo com as dimensões dadas!");
			System.exit(0);
        }
    }
    
    @Override
    public float calcularArea() {
        float areaTriangulo, meioPerimetro;
        
        meioPerimetro = super.calcularPerimetro()/2;
        areaTriangulo = (float) Math.sqrt(meioPerimetro * (meioPerimetro - getDimensoes()[0]) * (meioPerimetro - getDimensoes()[1]) * (meioPerimetro - getDimensoes()[2]));
       
        return areaTriangulo;
    }
}