package entities;

public class PessoaJuridica extends Pessoa {

	private Integer numeroDeFuncionarios;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numeroDeFuncionarios) {
		super(name, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public Integer getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double imposto() {
		if (numeroDeFuncionarios > 10) {
			return getRendaAnual() * 0.14;
		} else {
			return getRendaAnual() * 0.16;
		}
	}
}
