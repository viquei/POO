package poo0303;

public class CarroTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro civic = new Carro();
		civic.marca = "Honda";
		civic.modelo = "Civic EXL";
		civic.ano = 2020;
		civic.cor = "branco";
		civic.km = 100;
		
		Viagem rjsp = new Viagem();
		rjsp.codigo = 1;
		rjsp.descricao = "Rio de Janeiro - S�o Paulo";
		rjsp.duracao = 320;
		rjsp.km = 500;
		
		//rjsp.cancelarViagem();
		rjsp.confirmarViagem();
		civic.fecharPortas();
		//rjsp.abrirportas();
		civic.andar();
		if (rjsp.confirmada) {
			civic.km += rjsp.km;
			System.out.println("Este " +civic.modelo +" " +civic.marca +" estar� com " +civic.km +" quil�metros rodados ap�s esta viagem " +rjsp.descricao);
		}
	}

}
