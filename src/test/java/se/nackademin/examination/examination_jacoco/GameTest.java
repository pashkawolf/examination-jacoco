package se.nackademin.examination.examination_jacoco;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class GameTest {

	@Test
	public void testMethod1() {
		Game game = new Game();
		int i = game.calculateOutPutBasedOnNames("greg", "Silva");
		assertEquals("The result should be 0", i, 0);
		
		int b = game.calculateOutPutBasedOnNames("Rafael", "Silva");
		assertEquals("The result should be 1", b, 1);
		
		int c = game.calculateOutPutBasedOnNames("Rafael", "Silvan");
		assertEquals("The result should be 2", c, 2);
	}

	@Test
	public void testMethod2() {
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnGender('M');
		assertEquals("The result should be 0", i, 0);
		
		int b = game.calculateOutPutBasedOnGender('F');
		assertEquals("The result should be 1", b, 1);
		
		int c = game.calculateOutPutBasedOnGender('A');
		assertEquals("The result should be 1", c, 2);
    }
	
	@Test
	public void testMethod3() {
		Game game = new Game();
		
		int i = game.calculateOutPutBasedOnAge(5);
		assertEquals("The result should be 0", i, 0);
		
		int b = game.calculateOutPutBasedOnAge(45);
		assertEquals("The result should be 0", b, 1);
		

    }
	
	@Test
	public void testMethod4() {
		Game game = new Game();
		
		int a = game.calculateOutPutBasedOnHomeCity("a");
		assertEquals("The result should be 0", a, 0);
		
		int b = game.calculateOutPutBasedOnHomeCity("b");
		assertEquals("The result should be 0", b, 1);
		
		int c = game.calculateOutPutBasedOnHomeCity("c");
		assertEquals("The result should be 2", c, 2);
		
		int d = game.calculateOutPutBasedOnHomeCity("d");
		assertEquals("The result should be 3", d, 3);
		
		int e = game.calculateOutPutBasedOnHomeCity("e");
		assertEquals("The result should be 4", e, 4);
		
		int f = game.calculateOutPutBasedOnHomeCity("f");
		assertEquals("The result should be 5", f, 5);
		
		int g = game.calculateOutPutBasedOnHomeCity("g");
		assertEquals("The result should be 6", g, 6);
		
		int h = game.calculateOutPutBasedOnHomeCity("h");
		assertEquals("The result should be 7", h, 7);
		
		int i = game.calculateOutPutBasedOnHomeCity("i");
		assertEquals("The result should be 8", i, 8);
		
		int j = game.calculateOutPutBasedOnHomeCity("j");
		assertEquals("The result should be 9", j, 9);
		
		int k = game.calculateOutPutBasedOnHomeCity("k");
		assertEquals("The result should be 10", k, 10);
		
		 }
	
	@Test
	public void testMethod5() {
		Game game = new Game();
		ResultFromInputs res = new ResultFromInputs();
		Conversor con = new Conversor();
		game.buildFinalString("Rafael", "Silva",res, con);
}
	
	@Test
	public void testMethodRunGame() {
		Game game = new Game();
		
		game.runGame("MyGame", "Rafael", "Silva", 'M', 30, "Stockholm");
     }
	//I don't know
	@Test
	public void testMethodgetGenderFromInputValues() {
		Game game = new Game();
		//ArrayList<String> arrList = new ArrayList<String>();
		//sarrList.getGenderFromInputValues(arrList.get(3));
	
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Game name");
		arrList.add("Rafael");
		arrList.add("Silva");
		arrList.add("M");
		arrList.add("30");		
		arrList.add("Fortaleza");
		assertEquals("The result should be M", game.getGenderFromInputValues(arrList), 'M');
		
		//assert that the result from the method is equals to what we have here in the array
		
     }
	
	@Test
	public void testMethodgetAgeFromInputValues() {
		Game game = new Game();
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Game name");
		arrList.add("Rafael");
		arrList.add("Silva");
		arrList.add("M");
		arrList.add("30");		
		arrList.add("Fortaleza");
		assertEquals("The result should be 30", game.getAgeFromInputValues(arrList), 30);
     }
	@Test
	public void testRuntest() {
		Game game = new Game();
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("Game name");
		arrList.add("Rafael");
		arrList.add("Silva");
		arrList.add("M");
		arrList.add("30");		
		arrList.add("Fortaleza");
		game.run(arrList);
    }
}

