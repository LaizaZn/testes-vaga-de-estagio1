package animaisPOO;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato p = new Pato();
		p.setIdade(5);
		p.setTamanho(55);
		
		Vaca v = new Vaca();
		v.setIdade(18);
		v.setTamanho(150);
		
		Galinha g = new Galinha();
		g.setIdade(5);
		g.setTamanho(70);
		
		Morcego m = new Morcego();
		m.setIdade(15);
		m.setTamanho(50);
		
		System.out.println("Insira a letra correspondente ao nome do animal para mais informações:\n p = pato\n v = vaca\n g = galinha\n m = morcego");
		Scanner op = new Scanner(System.in);
		char letra = op.next().charAt(0);
		
		switch(letra) {
			case 'p':
				System.out.println("Pato:\n"+p.getIdade()+" anos");
				System.out.println("Pato:\n"+p.getTamanho()+" cm");
				p.botaOvo();
				p.emiteSom();
				p.voar();
				break;
			case 'v':
				System.out.println("Vaca:\n"+v.getIdade()+" anos");
				System.out.println("Vaca:\n"+v.getTamanho()+" cm");
				v.amamentar();
				v.emiteSom();
				break;
			case 'g':
				System.out.println("Galinha:\n"+g.getIdade()+" anos");
				System.out.println("Galinha:\n"+g.getTamanho()+" cm");
				g.botaOvo();
				g.emiteSom();
				break;
			case 'm':
				System.out.println("Morcego:\n"+m.getIdade()+" anos");
				System.out.println("Morcego:\n"+m.getTamanho()+" cm");
				m.amamentar();
				m.emiteSom();
				m.voar();
				break;
			default:
				System.out.print("digite uma letra minúscula válida");
				break;
		}
	}

}
