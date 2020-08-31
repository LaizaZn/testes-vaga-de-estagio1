package animaisPOO;

public class Animal {
	private int idade;
	private double tamanho;
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}

	
	public void emiteSom() {
		System.out.print("");
	}
}
