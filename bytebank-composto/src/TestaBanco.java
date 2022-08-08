
public class TestaBanco {

		public static void main(String[] args) {
			
			Cliente gabriel = new Cliente();
			gabriel.nome = "Gabriel";
			gabriel.cpf = "xxxxxxxxxxx";
			gabriel.profissao = "analista desenvolvedor junior";
			
			Conta contaDoGabriel = new Conta();
			contaDoGabriel.deposita(100);
			contaDoGabriel.titular = gabriel;

			System.out.println("================================="+"\n      INFORMAÇÕES DA CONTA"+"\n=================================");
			System.out.println("Nome do Titultar: " + contaDoGabriel.titular.nome);
			System.out.println("CPF do Titultar: "  + contaDoGabriel.titular.cpf);
			System.out.println("Profissão do Titultar: " + contaDoGabriel.titular.profissao);
			System.out.println("Saldo da conta: " + contaDoGabriel.getSaldo());
		}
}
