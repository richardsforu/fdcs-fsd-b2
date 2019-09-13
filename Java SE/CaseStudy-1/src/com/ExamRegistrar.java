package com;

public class ExamRegistrar {
    //leave it
	private ExamRegistrar() {
	}

	public static ExamRegistrar getExamRegistrar(){
	 return new ExamRegistrar();
	}

	Exam registeringStudentForExamination(Student student) {
		Paper paper = new Paper();
		Exam exam = new Exam(paper);
		return exam;
	}

}
