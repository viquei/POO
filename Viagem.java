package poo0303;

public class Viagem {
	int codigo;
	String descricao;
	int duracao;
	int km;
	boolean confirmada;
	
	void confirmarViagem() {
		confirmada = true; 
		System.out.println("Sua viagem " +descricao +" está confirmada.");
	}
	void cancelarViagem() {
		confirmada = false;
		System.out.println("Sua viagem " +descricao +" foi cancelada.");
	}
}
