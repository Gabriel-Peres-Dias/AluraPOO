
public class TestaGetESet {
	public static void main(String[] args) {
		
		Conta conta = new Conta(49607,54);
		conta.setNumero(2);
		System.out.println(conta.getNumero());
		
		Cliente gabriel = new Cliente();
		
		conta.setTitular(gabriel);
		gabriel.setNome("Gabriel Peres Dias");
		gabriel.setCpf("xxxxxxxxxxx");
		gabriel.setProfissao("Programador");
		
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
