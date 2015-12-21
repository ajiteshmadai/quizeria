/**
 * 
 */
package com.ajiteshjmadai.quizeria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ajiteshjmadai.quizeria.model.Answer;
import com.ajiteshjmadai.quizeria.model.Question;

/**
 * @author ajitesh
 *
 */

@RestController
@RequestMapping(value = "/question")
public class QuizController {

	private List<Question> questionList;

	// private List<Answer> answerList;

	public QuizController() {
		questionList = new ArrayList<Question>();
		// answerList = new ArrayList<Answer>();
		Answer a1 = new Answer(1, "Tokyo");
		Answer a2 = new Answer(2, "Delhi");
		Answer a3 = new Answer(3, "Sydney");
		Answer a4 = new Answer(4, "London");
		Answer a5 = new Answer(5, "Copenhagen");

		Question q0 = new Question();
		q0.setId(0);
		q0.setText("Placceholder question");
		questionList.add(q0);

		
		Question q1 = new Question();
		q1.setId(1);
		q1.setText("What is the capital of Japan?");
		q1.getAnswers().add(a1);
		q1.getAnswers().add(a2);
		q1.getAnswers().add(a3);
		q1.getAnswers().add(a4);
		q1.setIsMultichoice(false);
		questionList.add(q1);

		Question q2 = new Question();
		q2.setId(2);
		q2.setText("What is the capital of Denmark?");
		q2.getAnswers().add(a1);
		q2.getAnswers().add(a2);
		q2.getAnswers().add(a3);
		q2.getAnswers().add(a5);
		q2.setIsMultichoice(false);
		questionList.add(q2);

		Question q3 = new Question();
		q3.setId(3);
		q3.setText("Tell us something about youself..");
		questionList.add(q3);

	}

	@RequestMapping(value = "/next", method = RequestMethod.GET, produces = "application/json")
	public Question nextQuestion(
			@RequestParam(value = "currentQuestionId", required = false) Integer currentQuestionId) {

		Integer nextQuestionId = decideNextQuestionId(currentQuestionId);
		return questionList.get(nextQuestionId);

	}

	@RequestMapping(value = "/previous", method = RequestMethod.GET, produces = "application/json")
	public Question previousQuestion(
			@RequestParam(value = "currentQuestionId", required = false) Integer currentQuestionId) {

		
		Integer previousQuestionId = decidePreviousQuestionId(currentQuestionId);
		return questionList.get(previousQuestionId);
		

	}

	private Integer decideNextQuestionId(Integer currentQuestionId) {

		if (currentQuestionId == null || (currentQuestionId == questionList.size())) {
			return 1;
		} else {
			return ++currentQuestionId;
		}

	}
	
	private Integer decidePreviousQuestionId(Integer currentQuestionId) {

		if (currentQuestionId == null || (currentQuestionId == questionList.size())) {
			return 1;
		} else {
			return --currentQuestionId;
		}

	}

}
