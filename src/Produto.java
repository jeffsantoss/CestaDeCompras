
public class Produto {
    
	private int codigo;
	private String nome;
	private double pre�o;
	
	public Produto() {
		
	}
	
    public Produto(int codigo, String nome, double pre�o) {
    	
    	this.codigo = codigo;
    	this.nome = nome;
    	this.pre�o = pre�o;
		 
	}

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
    

}
