package desafio.poo.dio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso(); //intanciando um objeto curso (new realiza essa operação)
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria(); //intanciando um objeto mentoria
		
		
		//definições para os atributos de curso
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Descrição curso Java");
		curso1.setCargaHoraria(8);
		//System.out.println(curso1);
		
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Descrição curso JavaScript");
		curso2.setCargaHoraria(8);
		//System.out.println(curso2);
		
		//definições para os atributos de mentoria
		mentoria.setTitulo("POO");
		mentoria.setDescricao("Usando POO");
		mentoria.setData(LocalDate.now());	//define como data a ata atual	
		mentoria.setCargaHoraria(4);
		//System.out.println(mentoria);
		
		//Instanciando um bootcamp e atribuindo os dados 
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootacamp Java Dev");
		bootcamp.setDescricao("Descrição do Bootacamp Java Dev");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		//Instanciando um Dev e atribuindo os dados 
		Dev devSamuel = new Dev();		
		devSamuel.setNome("Samuel");
		devSamuel.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos que Samuel está inscrito: " + devSamuel.getConteudosInscritos());
		devSamuel.progredir();
		//devSamuel.progredir();
		System.out.println("-");
		System.out.println("Conteúdos que Samuel está inscrito: " + devSamuel.getConteudosInscritos());
		System.out.println("Conteudos concluidos Samuel: " + devSamuel.getConteudosConcluidos());
		System.out.println("XP" + devSamuel.calculeTotalXp());
		
		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos que Camila está inscrita: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		System.out.println("-");
		System.out.println("Conteúdos que Camila está inscrita: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos concluidos Camila: " + devCamila.getConteudosConcluidos());
		System.out.println("XP" + devCamila.calculeTotalXp());
	}

}
