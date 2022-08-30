package com.exam.service.impl;


import com.exam.model.exam.Question;

import com.exam.repo.QuestionRepository;
import com.exam.service.QuestionService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



//class contains business logic
@Service
public class QuestionServiceImpl implements QuestionService {

	// it will autowired all the beans into this class
	// it provide loose coupling
	@Autowired
	private QuestionRepository questionRepository;

	// Adding the question
	@Override
	public Question addQuestion(Question question) {
		return this.questionRepository.save(question);
	}

	

	// get all questions
	@Override
	public List<Question> getQuestions() {
		return this.questionRepository.findAll();
	}

	// get question using questionID
	@Override
	public Question getQuestion(Long questionId) {
		return this.questionRepository.findById(questionId).get();
	}

	// delete question using questionID
	@Override
	public void deleteQuestion(Long quesId) {
		Question question = new Question();
		question.setQuesId(quesId);
		this.questionRepository.delete(question);
	}


   //Update question
	@Override
	public Question updateQuestion(Question question, Long quesId) {
		Question question1 = new Question();
		question1.setContent(question1.getContent());
		question1.setOption1(question1.getOption1());
		question1.setOption2(question1.getOption2());
		question1.setOption3(question1.getOption3());
		question1.setOption4(question1.getOption4());
		question1.setAnswer(question1.getAnswer());
		
		return this.questionRepository.save(question1);
		
		
	}

}
