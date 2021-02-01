package com.abhirup.pradhan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long question_No;
	private String question_Question;
	private String question_A;
	private String question_B;
	private String question_C;
	private String question_D;
	private String question_Ans;
	private String question_Type;
	public long getQuestion_No() {
		return question_No;
	}
	public void setQuestion_No(long question_No) {
		this.question_No = question_No;
	}
	public String getQuestion_Question() {
		return question_Question;
	}
	public void setQuestion_Question(String question_Question) {
		this.question_Question = question_Question;
	}
	public String getQuestion_A() {
		return question_A;
	}
	public void setQuestion_A(String question_A) {
		this.question_A = question_A;
	}
	public String getQuestion_B() {
		return question_B;
	}
	public void setQuestion_B(String question_B) {
		this.question_B = question_B;
	}
	public String getQuestion_C() {
		return question_C;
	}
	public void setQuestion_C(String question_C) {
		this.question_C = question_C;
	}
	public String getQuestion_D() {
		return question_D;
	}
	public void setQuestion_D(String question_D) {
		this.question_D = question_D;
	}
	public String getQuestion_Ans() {
		return question_Ans;
	}
	public void setQuestion_Ans(String question_Ans) {
		this.question_Ans = question_Ans;
	}
	public String getQuestion_Type() {
		return question_Type;
	}
	public void setQuestion_Type(String question_Type) {
		this.question_Type = question_Type;
	}
	
}
