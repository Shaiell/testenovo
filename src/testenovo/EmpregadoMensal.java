package testenovo;

/**
 * representa um empregado assalariado.
 * 
 * @author jclri
 *
 */
public class EmpregadoMensal extends Empregado {

	private Double salario;

	public EmpregadoMensal(String nome, String email, String matricula, Double salario) {
		super(nome, email, matricula);
		this.salario = salario;
	}
	
	public Double getValorAPagar() {
		
		return this.salario;
	}

	public Double getSalario() {
		return salario;
	}

	@Override
	public String toString() {

		return "Empregado filho";
	}

}
