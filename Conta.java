package poo0903;

public class Conta {
	private float saldo;
	private String titular;
	
	public void depositar (float valor) {
		this.saldo = this.saldo + valor;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public String getTitular() {
		return this.titular;
	}
	public void setTitular(String titular) {
		 this.titular = titular;
	}
	public float sacar (float valor) {
		if (valor>this.saldo) {
			System.out.println("Saldo insuficiente.");
			return -1;
		}
		else {
			this.saldo = this.saldo - valor;
			return this.saldo;
		}
	}
}
