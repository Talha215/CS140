package assignment05;

import java.util.ArrayList;

public class MultiChoiceQuestion extends Question {
	private ArrayList<String> choices;
	private ArrayList<Integer> correctChoices;
	
	public MultiChoiceQuestion(String questionText) {
		super(questionText);
	}
	
	/**
    Adds an answer choice to this question.
    @param choice the choice to add
    @param correct true if this is the correct choice, false otherwise
	 */
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			correctChoice += choices.size();
		}
	}
}
