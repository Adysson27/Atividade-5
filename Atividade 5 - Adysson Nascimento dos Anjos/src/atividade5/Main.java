package atividade5;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
			Estudante estudante01 = new Estudante("Jeff Bezos", "Av. Agamenon Magalhães");
			estudante01.addCursoNota("Português", 9);
			estudante01.addCursoNota("Química", 10);
			estudante01.addCursoNota("Filosofia", 7);
			estudante01.addCursoNota("Literatura", 8);
			estudante01.addCursoNota("Física", 5);
			
			Estudante estudante02 = new Estudante("Elon Musk", "Av. Boa Viagem");
			estudante02.addCursoNota("Física", 7);
			estudante02.addCursoNota("Ed. Física", 10);
			estudante02.addCursoNota("Geografia", 5);
			estudante02.addCursoNota("Matemática", 9);
			estudante02.addCursoNota("Espanhol", 8);
			
			pessoas.add(estudante01);
			pessoas.add(estudante02);

			Professor  professor01 = new Professor("Terry Crews", "Av. Pres. Castelo Branco");
			professor01.addCurso("Física");
			professor01.addCurso("Matemática");
			
			Professor professor02 = new Professor("Luiz Gonzaga", "Av. Bernardo Vieira de Melo");
			professor02.addCurso("Geografia");
			professor02.addCurso("História");
			
			pessoas.add(professor01);
			pessoas.add(professor02);
			
	
			for(int i = 0; i<pessoas.size(); i++) {
				String str = pessoas.get(i).toString();
				System.out.println(str);
			}
			
			String test = pessoasData(pessoas);
			System.out.println(test);
	}
	
	private static String pessoasData(ArrayList<Pessoa> pessoas) {
		
		Professor professor = new Professor(null, null);
		Estudante estudante = new Estudante(null, null);
		String str = "";
		
			
			for(int i = 0; i< pessoas.size(); i++) {
					
				 if(professor.getClass() == pessoas.get(i).getClass()) {
					 Professor teacher = (Professor) pessoas.get(i);
					 
					 for(int y = 0; y < teacher.getCursos().size(); y++) {
						str += "Curso: "+ teacher.getCursos().get(y)+"\n";
						str += "Professor: " + teacher.getNome()+"\n";
						str += "Alunos: \n";
								
							for(int z = 0; z < pessoas.size(); z++) {
								
								if(estudante.getClass() == pessoas.get(z).getClass()) {
									Estudante student = (Estudante) pessoas.get(z);
									
									for(int x = 0; x < student.getCursos().size(); x++) {
										
										if(student.getCursos().get(x).equals(teacher.getCursos().get(y))) {
											str += student.getNome()+"\n";
										}
									}
								}
							}
							str +="------------------------- \n";
					 }
				 }
			}
			
			return str;
	}

}