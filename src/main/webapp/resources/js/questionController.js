/**
 * 
 */

quizApp.controller("QuestionController", [ '$http', function($http) {
	var questionCount = 0;
	// this.currentQuestion = questions[questionCount];
	var that = this;
	this.getNextQuestion = function() {
		$http.get('/quizeria/question/next').success(function(data) {
			that.currentQuestion = data;
		});

	};

	this.getPreviousQuestion = function() {
		$http.get('/quizeria/question/previous').success(function(data) {
			that.currentQuestion = data;
		});
	}

} ]);