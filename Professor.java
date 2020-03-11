package poo1003;

public class Professor {
	public Professor(){
		setDisponivel(true);
	}
	
	private String nome;
	private String mat;
	private String especialidade;
	private boolean disponivel;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMat() {
		return mat;
	}
	public void setMat(String mat) {
		this.mat = mat;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	public void listar() {
		System.out.println("Nome: " +getNome());
		System.out.println("Matricula: " +getMat());
		System.out.println("Especialidade: " +getEspecialidade());
		if (isDisponivel()) {
			System.out.println("Disponivel.");
		}
		else {
			System.out.println("Indisponivel.");
		}
	}
	
}
