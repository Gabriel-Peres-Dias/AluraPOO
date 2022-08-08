
public class TestaContaComExecaoCheked {
	public static void main(String[] args) {
		Conta c = new Conta();
		try {
		c.deposita();
	} catch (MinhaException ex) {
		System.out.println("Erro tratado");
	}
}
}
