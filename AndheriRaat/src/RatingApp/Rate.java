package RatingApp;

import Assessments.*;

public class Rate {

	public static void main(String[] args) {

		ScoreCalculator scoreCalculator = new ScoreCalculator();
		scoreCalculator.assessmentType.add(new CodingAssessment(80));
		scoreCalculator.assessmentType.add(new OnlineAssessment(86));
		scoreCalculator.assessmentType.add(new ClassPerformance(95));
		
		double total = scoreCalculator.calculateTotalScore();
		
		System.out.println("The Student total is:" +total);
		
		//Rating is in enum
		
	}

}
