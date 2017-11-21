package be.vdab.valueobjects;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class JaarTest {

	@Test
	public void deeldoor400isSchrikkel() {
		
		Jaar jaar = new Jaar(2000);
		assertTrue(jaar.isSchrikkeljaar());
		
		
	}
	
	@Test
	public void deeldoor100isGeenSchrikkel() {
		
		Jaar jaar = new Jaar(1900);
		assertFalse(jaar.isSchrikkeljaar());
		
		
	}
	
	@Test
	public void deeldoor4isSchrikkel() {
		
		Jaar jaar = new Jaar(1992);
	assertTrue(jaar.isSchrikkeljaar());
		
		
	}
	
	@Test
	public void nietDeeldoor4isGeenSchrikkel() {
		
		Jaar jaar = new Jaar(2017);
		assertFalse(jaar.isSchrikkeljaar());
		
		
	}
	
	

}
