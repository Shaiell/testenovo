package testenovo;

import java.util.ArrayList;

/**
 * Classe principal para execução do programa.
 * 
 * @author jclri
 *
 */
public class Principal {

	/**
	 * Metodo principal de execução.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		EmpregadoMensal joao = new EmpregadoMensal("jean", "jcl.ribeiro@hotmail.com", "1816113", 30000d);

		EmpregadoHorista maria = new EmpregadoHorista("Maria", "mm@m.com.br", "12937219", 45d, 150);

		EmpregadoComissionado ana = new EmpregadoComissionado("Ana", "Aninha@Anao.com", "18273", 2000d, 1567d);
		
		
		
		ArrayList<Empregado> empregados = new ArrayList<>();

		empregados.add(joao);
		empregados.add(maria);
		empregados.add(ana);

		for (Empregado empregado : empregados) {

			System.out.println(empregado.getNome() + ", " + empregado.getValorAPagar());

		}

	}

}
