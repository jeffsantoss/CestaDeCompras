
public class CestaDeCompras {
	
	private int codigo;
	//private Produto[] lista = new Produto[5];
	private ArrayList <Produto> carrinho = new ArrayList <Produto>;
	
	private int i;

	public CestaDeCompras(int codigo) {
		this.codigo = codigo;
	}
	
	public void incluir(Produto p ) throws ProdutoRepetidoException{
		if(lista.contains(p) == true)
		throw new ProdutoRepetidoException(p); // dispara a excessão (um alarme de erro)
		
		carrinho.add(p);
	
		
		/*
		for(int j = 0; j <this.i; j++){
			
			if( p.equals(lista[j]))
			throw new ProdutoRepetidoException(p);
			break;	
		}
			
		lista[this.i ++] = p;
		*/
	}
	
	
	public boolean verifica(Produto pr){
		
		for(int j = 0; j <this.i; j++){
			
			if( pr.equals(lista[j])){
				return true;
			}
			
		}
		return false;
	}
	
	

}
