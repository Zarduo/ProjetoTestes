import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesGerenciador {

	@Test
	void nomeDaEmpresa() {
		String nome = Empresa.nome();
		assertEquals("Caixa",nome);
	}
	
	@Test
	void funcionarioNome01() {
		String nomeF = Empresa.funcionario(1);
		assertEquals("Nome01",nomeF);
		
	}
	
	@Test
	void funcionarioNome02() {
		String nomeF = Empresa.funcionario(2);
		assertEquals("Nome02",nomeF);
		
	}
	
	@Test
	void nomeProjeto01() {
		String nomeF = Empresa.cria;
		assertEquals("Projeto01",nomeF);
		
	}
	
	@Test
	void nomeProjeto02() {
		String nomeF = Empresa.projeto(2);
		assertEquals("Projeto02",nomeF);
		
	}
	
	

}
