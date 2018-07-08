package com.nim.move.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nim.move.store.model.entity.Student;
import com.nim.move.store.service.StudentService;

@RestController
@RequestMapping("/student")
public class HelloController {
	
	@Autowired
	StudentService studentService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public Student hello(@PathVariable Integer id) {
		
		return studentService.getStudent(id);
	}
}
