
public class TesteSaca {
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123, 321);
		conta.deposita(200);
		try {
		conta.saca(200);
		} catch(SaldoInsuficienteException ex) {
			System.out.println("Mensagem de erro: " + ex.getMessage());
		}
		System.out.println(conta.getSaldo());
	}

}
