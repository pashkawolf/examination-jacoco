package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class DataAnalysisTest {

		@Test
		public void testgetResulStringHomecityAndAgetest() {
			DataAnalysis dataAnalysis = new DataAnalysis();
			ArrayList<String> values = new ArrayList<String>();
			values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Fortaleza"));
			String result = dataAnalysis.buildFinalString(values);
			assertTrue("The result should contain 'The name of the homecity is big and the participant is 30 or older' ",
					result.contains("The name of the homecity is big and the participant is 30 or older"));
			values.clear();
			values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "3", "Åbo"));
			String result1 = dataAnalysis.buildFinalString(values);
			
			assertTrue("The result should contain 'The name of the homecity is small and the participant is younger than 30' ",
					result1.contains("The name of the homecity is small and the participant is younger than 30"));
			
			values.clear();
			values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "30", "Åbo"));
			String result2 = dataAnalysis.buildFinalString(values);
			assertTrue("The result should contain 'The name of the homecity is small and the participant is 30 or olderr' ",
					result2.contains("The name of the homecity is small and the participant is 30 or older"));
			
			values.clear();
			values.addAll(Arrays.asList("Game", "Rafael", "Silva", "M", "25", "Fortaleza"));
			String result3 = dataAnalysis.buildFinalString(values);
			assertTrue("The result should contain 'The name of the homecity is big and the participant is younger than 30' ",
					result3.contains("The name of the homecity is big and the participant is younger than 30"));
	
		}
	    @Test
		public void getResultStringNamesAndAge1test() {
			DataAnalysis dataAnalysis = new DataAnalysis();
			ArrayList<String> values = new ArrayList<String>();
			values.addAll(Arrays.asList("Game", "Raf", "Silva", "M", "30", "Fortaleza"));
			String result = dataAnalysis.getResultStringNamesAndAge(values);
			assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younge' ",
			result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
			
	 }
		@Test
		public void getResultStringNamesAndAge2test() {
			DataAnalysis dataAnalysis = new DataAnalysis();
			ArrayList<String> values = new ArrayList<String>();
			values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "3", "Fortaleza"));
			String result = dataAnalysis.getResultStringNamesAndAge(values);
			assertTrue("The result should contain 'The first name is smaller or equals in size to the last name and the participant is 30 or younge' ",
			result.contains("The first name is smaller or equals in size to the last name and the participant is 30 or younger"));
		}
			@Test
			public void getResultStringNamesAndAge3test() {
				DataAnalysis dataAnalysis = new DataAnalysis();
				ArrayList<String> values = new ArrayList<String>();
				values.addAll(Arrays.asList("Game", "Rafae", "Silva", "M", "31", "Fortaleza"));
		        String result1 = dataAnalysis.getResultStringNamesAndAge(values);
		        assertTrue("The result1 should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result1.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
				
				
        }
			
			@Test
			public void getResultStringNamesAndAge4test() {
				DataAnalysis dataAnalysis = new DataAnalysis();
				ArrayList<String> values = new ArrayList<String>();
				values.addAll(Arrays.asList("Game", "Rafaello", "Silva", "M", "31", "Fortaleza"));
		        String result1 = dataAnalysis.getResultStringNamesAndAge(values);
		        assertTrue("The result1 should contain 'The first name is greater or equals in size to the last name and the participant older than 30' ",
				result1.contains("The first name is greater or equals in size to the last name and the participant older than 30"));
				
				
        }
}
