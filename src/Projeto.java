import java.util.LinkedList;
import java.util.List;


public class Projeto {
	
	private Empresa empresa;
	private String nome;
	private Integer codigo;
	

	protected Projeto(String nome, Integer codigo) {
		this.nome = nome;
		this.codigo = codigo;
		
	}

	public String obterIdentificador() {
		return String.format("%03d", codigo);
	}

	public String obterNome() {
		return nome;
	}



}
