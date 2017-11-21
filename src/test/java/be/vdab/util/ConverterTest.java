package be.vdab.util;

import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

	@Test
	public void eeninchis2komma54cm(){
		
		Converter converter = new Converter();
		assertEquals(0, BigDecimal.valueOf(2.54).compareTo(converter.inchesNaarCentimeters(BigDecimal.ONE)));
		
		
	}
	
	
	  @Test  
	  public void tweehonderdInchesIsVijfhonderdenachtCentimeters() {  
		  Converter converter = new Converter(); 
		  assertEquals(0, BigDecimal.valueOf(508)   
				  .compareTo(converter.inchesNaarCentimeters(BigDecimal.valueOf(200))));  
		  }

}
