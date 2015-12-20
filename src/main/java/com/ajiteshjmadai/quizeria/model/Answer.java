package com.ajiteshjmadai.quizeria.model;

public class Answer {

	private Integer id;

	private String text;

	public Answer() {
		this.id = 0;
		this.text = "";
	}

	public Answer(Integer id, String text) {
		this.id = id;
		this.text = text;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

}
