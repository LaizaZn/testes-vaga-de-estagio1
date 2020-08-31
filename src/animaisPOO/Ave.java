package animaisPOO;

public class Ave extends Animal {
	private boolean temPena = true;
	
	public boolean getTemPena(){
		return this.temPena;
	}
	
	public void botaOvo() {
		System.out.println("Bota ovo");
	}
}
