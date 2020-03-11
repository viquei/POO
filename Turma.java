package poo1003;

import java.util.ArrayList;

public class Turma {
	private String cod;
	private String descricao;
	private Professor professor;
	private ArrayList<Aluno> alunos;
	
	public Turma() {
		alunos = new ArrayList<Aluno>();
	}
	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}
	public String getCod() {
		return cod;
	}
	public void setCod(String cod) {
		this.cod = cod;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public void listar() {
		System.out.println("Codigo: " +getCod());
		System.out.println("Descrição: " +getDescricao());
		System.out.println("Professor: " +professor.getNome());
		System.out.println("Especialidade: " +professor.getEspecialidade());
		System.out.println("Listagem da turma: ");
		for(int i=0; i<this.alunos.size();i++) {
			Aluno aluno = alunos.get(i);
			System.out.println((i+1) + "°: " +aluno.getNome());
		}
	}
	public void adicionarAluno(Aluno novoAluno) {
		alunos.add(novoAluno);
	}
}
