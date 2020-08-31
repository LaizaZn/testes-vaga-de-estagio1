package animaisPOO;

public class Mamifero extends Animal {
	private boolean temPelo = true;
	
	public boolean getTemPelo() {
		return this.temPelo;
	}
	
	public void amamentar() {
		System.out.println("Amamenta");
	}
}
