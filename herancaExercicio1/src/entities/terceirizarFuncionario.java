package entities;

public class terceirizarFuncionario extends Empregado {

	private double cobrancaAdicional;

	public terceirizarFuncionario() {
		super();
	}

	public terceirizarFuncionario(String nome, Integer horas, double valorPorHora, double cobrancaAdicional) {
		super(nome, horas, valorPorHora);
		this.cobrancaAdicional = cobrancaAdicional;
	}

	public double getCobrancaAdicional() {
		return cobrancaAdicional;
	}

	public void setCobrancaAdicional(double cobrancaAdicional) {
		this.cobrancaAdicional = cobrancaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + cobrancaAdicional * 1.1;
	}

}
