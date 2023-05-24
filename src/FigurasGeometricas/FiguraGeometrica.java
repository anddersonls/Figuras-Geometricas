package FigurasGeometricas;

public abstract class FiguraGeometrica implements FiguraPlanar{
	private int numLados;
	private String nome;
	private float[] dimensoes;
	
	//CONSTRUTOR
	public FiguraGeometrica(int numLados, String nome, float[]dimensoes) {
		this.numLados = numLados;
		this.nome = nome;
		this.dimensoes = dimensoes;
	}
	
	/*
	//MÉTODO FACTORY
	public static FiguraGeometrica criarFiguraGeometrica(int numLados, String nome, float[]dimensoes) {
		if(numLados>2) {
			return new FiguraGeometrica(numLados, nome, dimensoes);
		}else {
            throw new IllegalArgumentException("Número de lados deve ser maior do que 2!");
        }

	} */
	
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
	
	public float calcularPerimetro() {
		float perimetro = 0.0F;
		
		for(int i = 0; i < dimensoes.length; i++) {
			perimetro += dimensoes[i];
		}
		
		return perimetro;
    }
}
