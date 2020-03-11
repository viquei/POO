package poo0903;

public class ContaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta itau = new Conta();
		
		itau.depositar(100f);
		itau.depositar(100f);
		
		System.out.println("Saldo:" +itau.getSaldo());
		
		itau.sacar(20f);
		
		System.out.println("Saldo:" +itau.getSaldo());
		
		itau.setTitular("Vitoria");
		
		System.out.println("Titular:" +itau.getTitular());
	}

}
