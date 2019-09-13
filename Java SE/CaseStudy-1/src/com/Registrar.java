package com;

public class Registrar {

	private Registrar() {

	}

	static Registrar getRegistrar() {
		return new Registrar();
	}

	public String registerStudent(Student student) {
		Validator validator = Validator.getValidator();
		if (validator.validateStudentDetails(student)) {
			// generate admission id and return it to the student
			return ("123456");
		}
		return null;
	}

}
