import org.junit.Before;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;

import cl.ubb.agil.Categoria;

public class testCategoria {

private Categoria categotia;
private String nombre = "guitarra electrica";
private String codigo = "aa000";

@Before 
public void setup() throws Exception{
 categotia= new Categoria(nombre, codigo);
	 System.out.println("paso");
}

@Test
public void getNombreGuitarraElectrica(){
	 /*arrange*/
	
	 /*act*/
	 String resultado=categotia.getNombre();
	 
	 /*assert*/
	 assertThat(resultado,is("guitarra electrica"));
	 
	 }

@Test
public void getCodigoaa000(){
	 /*arrange*/
	
	 /*act*/
	 String resultado=categotia.getCodigo();
	 /*assert*/
	 assertThat(resultado,is("aa000"));
	 
	 }
@Test  (expected=NullPointerException.class)
public void getCodigoNulo(){
	 /*arrange*/
	categotia.setCodigo(null);
	 
	 }

@Test
public void getCodigoSizeMayor5(){
	categotia.setCodigo("esto tiene mas de 5 caracteres");
	String resultado= categotia.getCodigo();
	assertThat(resultado,is("esto "));
}
@Test
public void setNombreLuxo(){
	categotia.setNombre("Luxo");	
	String resultado= categotia.getNombre();
	assertThat(resultado,is("Luxo"));
}

}
