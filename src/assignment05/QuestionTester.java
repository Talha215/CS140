package assignment05;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTester {

	@Test
	public void choiceQuestionTest() {
		ChoiceQuestion cq = new ChoiceQuestion("What is my purpose?");
		cq.addChoice("Nothing.", false);
		cq.addChoice("You pass butter.", true);
		cq.addChoice("Nothing.", false);
		cq.addChoice("Nothing.", false);
		assertTrue(cq.checkAnswer("2"));
		assertFalse(cq.checkAnswer("1"));
		assertFalse(cq.checkAnswer("3"));
		assertFalse(cq.checkAnswer("4"));
	}
	
	@Test
	public void MultichoiceQuestionTest() {
		MultichoiceQuestion mcq = new MultichoiceQuestion("Which are music genres?");
		mcq.addChoice("Electro Dance Music.", true);
		mcq.addChoice("Hip Hop", true);
		mcq.addChoice("Water Bottle", false);
		mcq.addChoice("Pop", true);
		assertTrue(mcq.checkAnswer("1 2 4"));
		assertFalse(mcq.checkAnswer("1"));
		assertFalse(mcq.checkAnswer("2"));
		assertFalse(mcq.checkAnswer("3"));
		assertFalse(mcq.checkAnswer("4"));
		assertFalse(mcq.checkAnswer("1 3 4"));
		assertFalse(mcq.checkAnswer("1 2 3 4"));
		assertFalse(mcq.checkAnswer("1 4"));
	}
}
