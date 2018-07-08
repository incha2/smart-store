package com.nim.move.store.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Student")
@Table(name="student")
public class Student implements Serializable{

	private static final long serialVersionUID = -6004677478253465721L;
	
	@Id
	@Column(name="roll")
	private Integer rollNo;
	@Column(name="name")
	private String name;
	@Column(name="class")
	private Integer clss;
	@Column(name="marks")
	private Integer marks;
	@Column(name="age")
	private Integer age;
	
	/**
	 * @return the rollNo
	 */
	public Integer getRollNo() {
		return rollNo;
	}
	/**
	 * @param rollNo the rollNo to set
	 */
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the clss
	 */
	public Integer getClss() {
		return clss;
	}
	/**
	 * @param clss the clss to set
	 */
	public void setClss(Integer clss) {
		this.clss = clss;
	}
	/**
	 * @return the marks
	 */
	public Integer getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", Name=" + name + ", clss="
				+ clss + ", marks=" + marks + ", age=" + age + "]";
	}
}
