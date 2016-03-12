package assignment05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MultichoiceQuestion extends Question {
	private ArrayList<String> choices = new ArrayList<String>();
	private ArrayList<Integer> correctChoices = new ArrayList<Integer>();
	
	public MultichoiceQuestion(String questionText) {
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
			correctChoices.add(choices.size());
		}
	}
	
	@Override
	public String prompt() {
		return "Your answers (if more than one, separate answers by spaces): ";
	}
	
	@Override
	public void display() {
		// Display the question text
		super.display();
		// Display the answer choices
		for (int i = 0; i < choices.size(); i++) {
			int choiceNumber = i + 1;
			System.out.println(choiceNumber + ": " + choices.get(i));     
		}
	}
	
	@Override
	public boolean checkAnswer(String response) {
		int correctAnswers = 0, incorrectAnswers = 0;
		Set<Integer> answers = new HashSet<>();
		
		try(Scanner scan = new Scanner(response)) {
			while(scan.hasNextInt()) {
				int ans = scan.nextInt();
				answers.add(ans);
			}
		}
		
		for(int i : answers) {
			if(correctChoices.contains(i))
				correctAnswers++;
			else
				incorrectAnswers++;
		}
		boolean ret = correctChoices.size() == correctAnswers && 
				incorrectAnswers == 0;
		if(!ret)
			System.out.println("Correct: " + correctAnswers + ", Incorrect: " + incorrectAnswers);
		return ret;
	}
	
	
}
