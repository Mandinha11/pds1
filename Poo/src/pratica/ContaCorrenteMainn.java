package pratica;

public class ContaCorrenteMainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente c = new ContaCorrente ();
		
		c.nomeTitular = "Amanda";
		c.cpf = 111333111222l;
		c.numeroDaconta = 1111111;
		c.saldo = 1000.0;
		
		c.depositar(50.0);
		c.sacar(200.0);
		c.mostrarDados();
		
	}

}
