package assignment05;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuestionTester {

	@Test
	public void choiceQuestionTestT() {
		ChoiceQuestion cq = new ChoiceQuestion("What is my purpose?");
		cq.addChoice("To fulfill your goal in life.", false);
		cq.addChoice("You pass butter.", true);
		cq.addChoice("You die alone.", false);
		cq.addChoice("To solve problems.", false);
		assertTrue(cq.checkAnswer("2"));
	}
	
	@Test
	public void choiceQuestionTestF() {
		ChoiceQuestion cq = new ChoiceQuestion("What is my purpose?");
		cq.addChoice("To fulfill your goal in life.", false);
		cq.addChoice("You pass butter.", true);
		cq.addChoice("You die alone.", false);
		cq.addChoice("To solve problems.", false);
		assertFalse(cq.checkAnswer("1"));
	}
	
	@Test
	public void MultichoiceQuestionTestT() {
		MultiChoiceQuestion mcq = new MultiChoiceQuestion("Which are music genres?");
		mcq.addChoice("Electro Dance Music.", true);
		mcq.addChoice("Hip Hop", true);
		mcq.addChoice("Water Bottle", false);
		mcq.addChoice("Pop", true);
		assertTrue(mcq.checkAnswer("1 2 4"));
	}
	
	@Test
	public void MultichoiceQuestionTestF() {
		MultiChoiceQuestion mcq = new MultiChoiceQuestion("Which are music genres?");
		mcq.addChoice("Electro Dance Music.", true);
		mcq.addChoice("Hip Hop", true);
		mcq.addChoice("Water Bottle", false);
		mcq.addChoice("Pop", true);
		assertTrue(mcq.checkAnswer("1 2 3 4"));
	}
}
