import org.junit.Before;

import org.junit.Test;

import cl.ubb.agil.Categoria;
import cl.ubb.agil.Existencia;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;

public class TestExistencia {
	private Existencia existencia;
	private String num;

	@Before 
	public void setup() throws Exception{
	 existencia= new Existencia(num);
		 System.out.println("paso");
	}
	
	@Test
	public void getNumeroUno(){
		Existencia existenciaP=new Existencia("0");
		
		 String resultado=existenciaP.getNumero();
		 assertThat(resultado,is("0"));
	}
	
	@Test
	public void getNumeroMenos100(){
		Existencia existenciaP=new Existencia("-100");
		
		 String resultado=existenciaP.getNumero();
		 assertThat(resultado,is("-100"));
	}
	
	@Test
	public void getNumero100(){
		Existencia existenciaP=new Existencia("100");
		
		 String resultado=existenciaP.getNumero();
		 assertThat(resultado,is("100"));
	}
}
