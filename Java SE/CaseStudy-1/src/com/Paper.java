package com;

public class Paper {

	String submit() {
		Evaluator evaluator = Evaluator.getEvaluator();
		String result = evaluator.evaluate(this);
		return result;
	}

}
