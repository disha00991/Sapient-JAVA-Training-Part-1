package Assessments;

public class CodingAssessment implements RealTimeAssessment {

	private double marks;
	
	public CodingAssessment(double marks) {
		this.marks = marks;
	}
	
	@Override
	public void showScore() {
		
	}

	@Override
	public double calcWeightedScore() {
		double weightedScore = marks * Weightage.codingAssessment.getWeight();
		return weightedScore;
	}

	@Override
	public void takeAssessment() {
		System.out.println("Coding test done!");
	}

}
