import org.junit.Before;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;

import cl.ubb.agil.Categoria;
import cl.ubb.agil.Producto;

public class TestProducto {
private Producto producto;

private Categoria categroria;
private String nombre;
private int stock_min;
private int stock_max;

@Before 
public void setup() throws Exception{
 producto= new Producto(nombre, stock_min, stock_max, categroria);
	 System.out.println("paso");
}

@Test
public void subtractorCuatroMenosTresUno(){
	 /*arrange*/
	  //calculadora =new Calculadora();
	 
	 /*act*/
	// int resultado=calculator.subtractor(4,3);
	 
	 /*assert*/
	 //assertThat(resultado,is(1));
	 
	 }


}
