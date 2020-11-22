package com.example.quizapp;

public class Quiz {
	
	private String question;
	
	private boolean answer;
	
	public Quiz(String question, boolean answer) {
		this.question = question;
		this.answer = answer;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public boolean isAnswer() {
		return answer;
	}

	@Override
	public String toString() {
		String marubatsu = answer ? "○" : "×";
		return question + "　" + marubatsu;
	}
	
	public static Quiz fromString(String line) {
		String question = line.substring(0, line.length() - 2 );
		boolean answer = line.endsWith("○");
		
		return new Quiz(question, answer);
	}
	
}
