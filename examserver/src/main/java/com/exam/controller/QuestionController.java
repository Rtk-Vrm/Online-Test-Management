package com.exam.controller;

import com.exam.model.exam.Question;
import com.exam.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

//allows to handle all REST APIs such as GET,post requests
@RestController

//used to map the http web request
@RequestMapping("/question")
public class QuestionController {

	// Autowired is to inject the dependancy into a bean
	// it will autowired all the beans into this class
	// it provide loose coupling
	@Autowired
	private QuestionService service;

	// add question
	@PostMapping("/")
	public ResponseEntity<Question> add(@RequestBody Question question) {
		return ResponseEntity.ok(this.service.addQuestion(question));
	}

	//update the question
	@PutMapping("/{quesId}")
	public Question updateQuestion(@RequestBody Question question,@PathVariable("quesId") Long quesId) {
		return this.service.updateQuestion(question,quesId);
	}

	// get all question 
	@GetMapping("/")
	public List<Question> getQuestions() {
		return this.service.getQuestions();

	}

	// get single question
	@GetMapping("/{quesId}")
	public Question get(@PathVariable("quesId") Long quesId) {
		return this.service.getQuestion(quesId);
	}

	// delete question
	@DeleteMapping("/{quesId}")
	public void delete(@PathVariable("quesId") Long quesId) {
		this.service.deleteQuestion(quesId);
	}

}
