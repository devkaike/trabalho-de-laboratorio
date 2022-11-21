import java.util.Random;

public class Controle {
	private int tentativa, interI, interF;
	private int tam;
	
	public Controle(int tent, int ii, int inf, int t) {
		tentativa = tent;
		interI = ii;
		interF = inf;
		tam = t;
	}
	int t[] = new int[tam];
	Random r = new Random();
	public boolean iniciaJogo() {
		int n;
		n = r.nextInt(interF)+interI;
		
	}
	public int getTentativa() {
		return tentativa;
	}

	public void setTentativa(int tentativa) {
		this.tentativa = tentativa;
	}

	public int getInterI() {
		return interI;
	}

	public void setInterI(int interI) {
		this.interI = interI;
	}

	public int getInterF() {
		return interF;
	}

	public void setInterFinal(int interF) {
		this.interF = interF;
	}
}
