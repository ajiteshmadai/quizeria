package com.ajiteshjmadai.quizeria.model;

import java.util.ArrayList;
import java.util.List;

public class Question {

	private Integer id;

	private String text;

	private List<Answer> answers;

	private Boolean isMultichoice;

	private Boolean isOptional;

	public Question() {
		this.id = 0;
		this.text = "";
		this.answers = new ArrayList<Answer>();
		this.isMultichoice = false;
		this.isOptional = false;
	}

	public Question(Integer id, String text, List<Answer> answers, Boolean isMultichoice, Boolean isOptional) {
		super();
		this.id = id;
		this.text = text;
		this.answers = answers;
		this.isMultichoice = isMultichoice;
		this.isOptional = isOptional;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	/**
	 * @return the isMultichoice
	 */
	public Boolean getIsMultichoice() {
		return isMultichoice;
	}

	/**
	 * @param isMultichoice
	 *            the isMultichoice to set
	 */
	public void setIsMultichoice(Boolean isMultichoice) {
		this.isMultichoice = isMultichoice;
	}

	public Boolean getIsOptional() {
		return isOptional;
	}

	public void setIsOptional(Boolean isOptional) {
		this.isOptional = isOptional;
	}

}
