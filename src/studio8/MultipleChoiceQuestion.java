package studio8;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt, answer, points);
			this.choices = choices; 
	}
	
	public void displayPrompt() {
		System.out.println(super.getPrompt() + "(" + this.getPoints() + " points)");
		int count = 0;
		for (int i=0; i<choices.length; i++) {
			count++;
			System.out.println(count + ". " + choices[i]);
		}
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
		String[] choices2 = {"yes", "no", "maybe", "I have no idea what's going on"};
		Question multipleChoice2 = new MultipleChoiceQuestion("Do you like this quiz?", "yes", 5, choices2 );
		multipleChoice2.displayPrompt();
		System.out.println(multipleChoice2.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice2.checkAnswer("1"));//wrong
		System.out.println(multipleChoice2.checkAnswer("3"));//right
	}

}
