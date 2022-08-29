package aplicacao;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
	
		deposit(depositoInicial);
	}
	public Integer getNumber() {
		return numero;
	}
	
	public String getHolder() {
		return titular;
	}
	public void setHolder(String titular) {
		this.titular = titular;
	}
	public Double getBalance() {
		return saldo;
	}
	
	public void deposit(double quantia) {
		saldo += quantia;
	}
	public void withraw(double quantia) {
		saldo -= quantia + 5.0;
	}
	@Override
	public String toString() {
		return "Conta "
				+ numero
				+ ", titular: "
				+ titular
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);

	}
}
