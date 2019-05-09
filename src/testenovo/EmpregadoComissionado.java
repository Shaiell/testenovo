package testenovo;

/**
 * representa um empregado comissionado
 * 
 * @author jclri
 *
 */

public class EmpregadoComissionado extends Empregado {

	private Double salarioBase;
	
	private Double comissao;

	
	
	public EmpregadoComissionado(String nome, String email, String matricula, Double salarioBase, Double comissao) {
		super(nome, email, matricula);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}
	
	@Override
		public Double getValorAPagar() {

			return this.comissao+this.salarioBase;
		}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}
	
	
	
}
