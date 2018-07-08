package com.nim.move.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nim.move.store.model.entity.Student;
import com.nim.move.store.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;
	
	public Student getStudent(Integer id) {
		
		return studentRepo.getStudent(id);
	}

}
