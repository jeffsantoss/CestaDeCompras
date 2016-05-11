
public class Principal {

	public Principal() {
		
	}
	
	
	public static void main(String[] args)
	{
		Produto p1 = new Produto(123, "Computador", 1000.0);
		Produto p2 = new Produto(123, "dsaasd", 12112);
		CestaDeCompras c = new CestaDeCompras(123);
		
		try{
			c.incluir(p1);
			c.incluir(p1);
			
		}
		catch (ProdutoRepetidoException a)
		{
			System.out.println("Produto já incluso na lista: "  + a.getTratar().getNome() + " Preco "+ a.getTratar().getPreço());
			
		}
		
		
	}

}
