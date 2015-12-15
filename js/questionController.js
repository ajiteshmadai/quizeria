/**
 * 
 */

var questions = [ {
	question : 'What is the capital of Japan?',
	answers : [ 'Tokyo', 'Delhi', 'Sydney', 'London' ],
	isOptional : false,
	isMutliChoice : true
},

{
	question : 'What is the capital of Denmark?',
	answers : [ 'Tokyo', 'Delhi', 'Copenhagen', 'London' ],
	isOptional : true,
	isMutliChoice : false
},

{
	question : 'Tell us something about youself..',
	isOptional: false
}

];

quizApp.controller("QuestionController", function() {
	var questionCount = 0;
	this.currentQuestion = questions[questionCount];	
	this.getNextQuestion = function() {
		
		this.currentQuestion = questions[questionCount++];
	};

});