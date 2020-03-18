import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTeste {
	Pais pais, copia;
	static int id = 0;
	
	@Before
	public void setUp() throws Exception{
		System.out.println("setup");
		pais = new Pais(id, "Canada", 1234, 123.1);
		copia = new Pais(id, "Canada", 1234, 123.1);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("Carregar");
		Pais fixture = new Pais(2, "Japão", 147, 147.8);
		Pais novo = new Pais(1, null, -1, -1);
		novo.carregar();
		assertEquals("testa inclusão", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		pais.criar();
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criação", pais, copia);
	}
	
	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
		pais.setPopulacao(999999);
		copia.setPopulacao(999999);
		pais.atualizar();
		pais.carregar();
		assertEquals("testa atualização", pais, copia);
	}
	
	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		copia.setNome(null);
		copia.setPopulacao(-1);
		copia.setArea(-1);
		pais.excluir();
		pais.carregar();
		assertEquals("testa exclusão", pais, copia);
	}
}
