package poo0303;

public class Carro {
	String marca;
	String modelo;
	int ano;
	String cor;
	int km;
	boolean portasFechadas;
	
	void fecharPortas() {
		portasFechadas = true;
	}
	void abrirPortas() {
		portasFechadas = false;
	}
	
	void andar() {
		if (portasFechadas){
			System.out.println("O carro est� em movimento.");
		}
		else {
			System.out.println("Certifique-se de que todas as portas est�o fechadas para que o carro ande.");
		}
	}
		
}

