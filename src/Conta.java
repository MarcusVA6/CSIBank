
public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		if(valor <= 300)
			saldo += valor;
		else
			System.out.println("Limite diário atingido!");
	}
}
