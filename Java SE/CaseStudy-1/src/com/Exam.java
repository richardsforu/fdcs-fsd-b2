package com;


public class Exam {
	
	/*
	 * 	-> Exam class required a paper to be conducted
	 * -> getPaper method gives you a paper object from the paper class
	 * -> Exam(Paper paper) argument based constructor force you to pass a paper object while
	 *    Exam class object is creating. I.e. With out Paper class object, then creating Exam class
	 *    Object is not possible here, because of Exam class does not provided default constructor
	 */
	
	private Paper paper;
	

	

	public Exam(Paper paper) {
		this.paper = paper;
	}

	public Paper getPaper(){
	 return paper;
	}

}
