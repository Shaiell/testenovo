package testenovo;


/**
 * Representa um empregado horista.
 * 
 * @author jclri
 *
 */
public class EmpregadoHorista extends Empregado {
	
	private Double salarioPorHora;
	
	private Integer quantidadeDeHoras;
	
	

	public EmpregadoHorista(String nome, String email, String matricula, Double salarioPorHora,
			Integer quantidadeDeHoras) {
		super(nome, email, matricula);
		this.salarioPorHora = salarioPorHora;
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

	public Double getValorAPagar() {
		return this.salarioPorHora*this.quantidadeDeHoras;
	}
	
	public Double getSalarioPorHora() {
		return salarioPorHora;
	}

	public void setSalarioPorHora(Double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public Integer getQuantidadeDeHoras() {
		return quantidadeDeHoras;
	}

	public void setQuantidadeDeHoras(Integer quantidadeDeHoras) {
		this.quantidadeDeHoras = quantidadeDeHoras;
	}

}
