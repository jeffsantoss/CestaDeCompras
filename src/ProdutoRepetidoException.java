
public class ProdutoRepetidoException extends Exception {

	private Produto tratar;

	
	ProdutoRepetidoException(Produto a){
		tratar = a;
	}



	public Produto getTratar() {
		return tratar;
	}



	public void setTratar(Produto tratar) {
		this.tratar = tratar;
	}
	
	
	
	
}
