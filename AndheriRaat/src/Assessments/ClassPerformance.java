package Assessments;

public class ClassPerformance implements Assessment {
	
	private double marks;
	
	public ClassPerformance(double marks) {
		this.marks = marks;
	}

	@Override
	public void showScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcWeightedScore() {
		double weightedScore = marks * Weightage.classPerformance.getWeight();
		return weightedScore;
	}

}
