package com.exam.repo;

import com.exam.model.exam.Question;
import org.springframework.data.jpa.repository.JpaRepository;



//JpaRepository is spring data interface for generic crud operation
public interface QuestionRepository extends JpaRepository<Question, Long> {
    
	
}
