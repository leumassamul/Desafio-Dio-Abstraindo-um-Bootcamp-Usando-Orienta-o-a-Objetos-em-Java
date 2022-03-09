package desafio.poo.dio;

public abstract class Conteudo {
	
	// valor de xp atribuido
	protected static final double XP_Padrao = 10d; // todas as classes criadas a partir desta j� possuir�o xp padr�o
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXP();
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

}
