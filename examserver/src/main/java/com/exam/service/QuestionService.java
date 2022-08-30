package com.exam.service;

import com.exam.model.exam.Question;

import java.util.List;


public interface QuestionService {

	//Add question
	public Question addQuestion(Question question);

	//get all question
	public List<Question> getQuestions();

	//get single question using questionId
	public Question getQuestion(Long questionId);

	//delete question using questionId
	public void deleteQuestion(Long quesId);

	public Question updateQuestion(Question question, Long quesId);

}
