package com.nim.move.store.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.nim.move.store.model.entity.Student;

@Repository
public class StudentRepo {

	@PersistenceContext
	private EntityManager em;
	
	public Student getStudent(Integer id) {
		return em.find(Student.class, id);
	}

}
