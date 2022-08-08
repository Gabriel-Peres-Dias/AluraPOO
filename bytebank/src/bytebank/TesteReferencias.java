package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
			
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println(segundaConta);
		System.out.println(primeiraConta);
		
		System.out.println(segundaConta.saldo);
		
		// Diferença entre refência e objeto
		if(primeiraConta == segundaConta) {
			System.out.println("É verdade bixo");
			} else {
			System.out.println("É mintira");
			}
		}

	

}
