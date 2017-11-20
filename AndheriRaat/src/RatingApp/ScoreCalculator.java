package RatingApp;

import java.util.ArrayList;
import java.util.List;

import Assessments.Assessment;

public class ScoreCalculator {
	
	List<Assessment> assessmentType = new ArrayList<Assessment>();

	public void addAssessmentType(Assessment obj) {
		assessmentType.add(obj);
	}
	
	public void removeAssessmentType(Assessment obj) {
		assessmentType.remove(obj);
	}
	
	public double calculateTotalScore() {
		
		double total = 0.0;
		for (Assessment type : assessmentType)
			total += type.calcWeightedScore();
		
		return total;
	}
	
}
