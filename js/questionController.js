/**
 * 
 */

var questions = [ {
	question : 'What is the capital of Japan?',
	answers : [ 'Tokyo', 'Delhi', 'Sydney', 'London' ]
},

{
	question : 'What is the capital of Denmark?',
	answers : [ 'Tokyo', 'Delhi', 'Copenhagen', 'London' ]
}

];

quizApp.controller("QuestionController", function() {

	this.currentQuestion = questions[0];	
	this.getNextQuestion = function() {
		
		this.currentQuestion = questions[1];
	};

});