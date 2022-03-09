package desafio.poo.dio;

public class Curso extends Conteudo{// classe curso é filha de conteudo
	
	//atributos 
	private int cargaHoraria;
	
	//regra de negocio
	@Override
	public double calcularXP() {
		return XP_Padrao * cargaHoraria;
	}
	
	// to String
	@Override
	public String toString() {
		return "Curso [titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + "]";
	}
		
	public Curso() {
		
	}	
	
	//gets and sets
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
