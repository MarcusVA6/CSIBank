
public class CriarConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.deposita(400);
		System.out.println("Saldo: " + conta1.saldo);
		
		conta1.deposita(50);
		System.out.println("Novo Saldo: " + conta1.saldo);
		
		Conta conta2 = new Conta();
		conta2.deposita(50);
	
		System.out.println("Saldo Conta1: " + conta1.saldo);
		System.out.println("Saldo Conta2: " + conta2.saldo);
		
		System.out.println("Agência Conta1: " + conta1.agencia);
		System.out.println("Titular Conta1: " + conta1.titular);
	
		conta1.agencia = 123;
		conta1.numero = 987654;
		conta1.deposita(200);
		conta1.titular = "Pedro";

		conta2.agencia = 123;
		conta2.numero = 987654;
		conta2.deposita(200);
		conta2.titular = "Maria";
		
		if(conta1 == conta2) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
		
		if(conta1.titular == conta2.titular) {
			System.out.println("São iguais");
		}else {
			System.out.println("São diferentes");
		}
	}

}
