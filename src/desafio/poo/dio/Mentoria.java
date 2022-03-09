package desafio.poo.dio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {// classe mentoria é filha de conteudo

	private int cargaHoraria;
	private LocalDate data;

	@Override
	public double calcularXP() {
		return XP_Padrao + 20;
	}
	
	// to String alterado com gets para utilizar os itens de conteudo
	@Override
	public String toString() {
		return "Mentoria [tittulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + ", data=" + data + "]";
	} 

	public Mentoria() {

	}

	// gets and sets
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
