package poo1003;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turma logicaDigital = new Turma();
		Professor engenharia = new Professor();
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		engenharia.setNome("Alberto");
		engenharia.setEspecialidade("Engenharia Eletrica");
		engenharia.setMat("0269");
		engenharia.setDisponivel(false);
		
		logicaDigital.setCod("25");
		logicaDigital.setDescricao("Logica Digital");
		logicaDigital.setProfessor(engenharia);
			
		a1.setNome("Roberto");
		a1.setMatricula("0289");
		a1.setPeriodo(3);
		
		a2.setNome("Maria");
		a2.setMatricula("0279");
		a2.setPeriodo(4);
		
		a3.setNome("Silvia");
		a3.setMatricula("0269");
		a3.setPeriodo(4);
		
		logicaDigital.adicionarAluno(a1);
		logicaDigital.adicionarAluno(a2);
		logicaDigital.adicionarAluno(a3);
		
		logicaDigital.listar();
	}

}
