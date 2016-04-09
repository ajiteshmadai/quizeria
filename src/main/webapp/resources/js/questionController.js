// ==ClosureCompiler==
// @output_file_name default.js
// @compilation_level SIMPLE_OPTIMIZATIONS
// ==/ClosureCompiler==

/**
 *
 */

quizApp.controller("QuestionController", ['$http', function($http) {

	var that = this;
	this.getNextQuestion = function(currentQuestionId) {
		$http.get('/quizeria/question/next', {
			params : {
				'currentQuestionId' : currentQuestionId
			}
		}).success(function(data) {
			that.currentQuestion = data;

		});

	};

	this.getPreviousQuestion = function(currentQuestionId) {
		$http.get('/quizeria/question/previous', {
			params : {
				'currentQuestionId' : currentQuestionId
			}
		}).success(function(data) {
			that.currentQuestion = data;
		});
	}

	this.currentQuestion = this.getNextQuestion();


} ]);