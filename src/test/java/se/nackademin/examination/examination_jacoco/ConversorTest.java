package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ConversorTest {

	@Test
	public void testConversorsetNameConverterArrayValues() {
		Conversor conversor = new Conversor();
		conversor.setNameConverterArrayValues();
		assertEquals(conversor.getNameConverterArray().get(0), "Your first name is smaller than your last name");
	}
	
	@Test
	public void testConversorsetAgeConverterArrayValues() {
		Conversor conversor = new Conversor();
		conversor.setAgeConverterArrayValues();
		assertEquals(conversor.getAgeConverterArray().get(0), "You are young and talented! Things will come your way soon enough! ");
	}

	@Test
	public void testConversorsetGenderConverterArrayValues() {
		Conversor conversor = new Conversor();
		conversor.setGenderConverterArrayValues();
		assertEquals(conversor.getGenderConverterArray().get(1), "woman!");
	}

	@Test
	public void testConversorsetCityConverterArrayValues() {
		Conversor conversor = new Conversor();
		//ArrayList<String> arrList = new ArrayList<String>();
		conversor.setCityConverterArrayValues();
		assertEquals(conversor.getCityConverterArray().get(0), " A, ");
	
	}
}
