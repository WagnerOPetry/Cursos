package entities;

public abstract class Pessoa {
	
	private String name;
	protected Double rendaAnual;
	
	public Pessoa() {
		super();		
	}

	public Pessoa(String name, Double rendaAnual) {
		super();
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnuel(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract Double imposto();
				
}
