package conta.banco;

public class ContaTerminal {
	public int numero;
	public String agencia;
	public String nomeCliente;
	public double saldo;
	
	public void exibirMessagem() {
		String menssagem = "Olá"+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque";
		System.out.println(menssagem);
	}
}
