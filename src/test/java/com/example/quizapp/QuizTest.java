package com.example.quizapp;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class QuizTest {
	
	@Test
	public void toStringWhenMaru() {
		Quiz quiz = new Quiz("問題文", true);
		assertThat(quiz.toString(), is("問題文　○"));
	}
	
	
	
	@Test
	public void fromStringWhenMaru() {
		String line = "問題1　○";
		Quiz quiz = Quiz.fromString(line);
		
		assertThat(quiz.getQuestion(), is("問題1"));
		assertThat(quiz.isAnswer(), is(true));
	}
	
}
