package com.abhirup.pradhan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhirup.pradhan.model.Question;
import com.abhirup.pradhan.repository.QuestionRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class QuestionController {

	@Autowired
	private QuestionRepository qR;
	@GetMapping("/get/{No}")
	public Question getQuestion(@PathVariable("No") long No) {
		return qR.getOne(No);
	}
	@GetMapping("/getall")
	public List<Question> getQuestion() {
		return qR.findAll();
	}
	@PostMapping("/add")
	public void addQuestion(@RequestBody Question question) {
		qR.save(question);
	}
	@PutMapping("/update")
	public void updateQuestion(@RequestBody Question question) {
		qR.save(question);
	}
	@DeleteMapping("/delete/{No}")
	public void deleteQuestion(@PathVariable("No") long No) {
		qR.deleteById(No);
	}
}
