
public class Cubo extends Figura3D {

	private int aresta;
	
	public Cubo(int aresta) {
		this.aresta = aresta;
	}
	
	public int getAresta() {
		return aresta;
	}

	public void setAresta(int aresta) {
		this.aresta = aresta;
	}
	
	@Override
	public double calculaVolume() {
		return Math.pow(getAresta(), 3);
	}

	
}
