
public class TestaContaSemSemCliente {

	public static void main(String[] args) {

		Conta contaDoGabriel = new Conta();
		
		contaDoGabriel.titular = new Cliente();
		contaDoGabriel.titular.nome = "Gabriel";
		System.out.println(contaDoGabriel.titular.nome);
	}

}
