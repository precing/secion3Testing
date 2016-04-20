import org.junit.Before;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;

import cl.ubb.agil.Categoria;
import cl.ubb.agil.Producto;


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


}
