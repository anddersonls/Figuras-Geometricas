package FigurasGeometricas;

public abstract class FiguraGeometrica implements FiguraPlanar{
	private int numLados;
	private String nome;
	private float[] dimensoes;
	
	//CONSTRUTOR
	public FiguraGeometrica(int numLados, String nome, float[]dimensoes) {
		if(numLados>2) {
			this.numLados = numLados;
			this.nome = nome;
			this.dimensoes = dimensoes;
		}else {
			System.err.println("Não é possível gerar uma fígura geométrica com "+ numLados +" lados!");
			System.exit(0);
		}
	}
	
	//GETTERS 
	public int getNumLados() {
		return numLados;
	}
	
	public String getNome() {
		return nome;
	}

	public float[] getDimensoes() {
		return dimensoes;
	}
	
	//SETTERS
	public void setNumLados(int numLados) {
		this.numLados = numLados;
	}
	
	public void setNumLados(String nome) {
		this.nome = nome;
	}
	
	public void setNumLados(float[] dimensoes) {
		this.dimensoes = dimensoes;
	}
	
	//OUTROS MÉTODOS
	public void mostrarDimensoes(){
		System.out.print("Tamanho dos lados: ");
        for (float dimensao : dimensoes) {
        	System.out.print(dimensao + " ");
        }
        System.out.println();
	} 
	
	public abstract float calcularArea();
	
	public float calcularPerimetro() {
		float perimetro = 0.0F;
		
		for(int i = 0; i < dimensoes.length; i++) {
			perimetro += dimensoes[i];
		}
		
		return perimetro;
    }
}
