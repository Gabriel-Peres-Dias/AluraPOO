package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.titular = "Gabriel";
		System.out.println("Primeira Conta:" + "\nTitular: " + primeiraConta.titular + "\nSaldo: " + primeiraConta.saldo);
		
		primeiraConta.saldo+=100;
		//System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		segundaConta.titular = "Carlos";
		System.out.println("Segunda Conta:" + "\nTitular: " + segundaConta.titular + "\nSaldo: " + segundaConta.saldo);
		
		
		System.out.println(primeiraConta.agencia);
		System.out.println(primeiraConta.numero);
	}

}
