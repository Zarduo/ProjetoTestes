import java.util.List;


public class Empresa {

	private static String[] nomeFuncionarios = {"Nome01", "Nome02", "Nome03"};
	private static String[] nomeProjetos = {"Projeto01", "Projeto02", "Projeto03"};
	
	private List<Projeto> projetos;
	
	
	public static String nome() {
		return "Caixa";
	}

	public static String funcionario(Integer i) {	
		i--;
		return (nomeFuncionarios[i]);
	}

	public Projeto criarProjeto(String nome) {
		Projeto projeto = new Projeto(nome, projetos.size() + 1);
		projetos.add(projeto);
		return projeto;
	}
	
}
