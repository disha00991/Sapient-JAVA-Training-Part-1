package Assessments;

public class OnlineAssessment implements RealTimeAssessment {

    private double marks;
	
	public OnlineAssessment(double marks) {
		this.marks = marks;
	}
	
	@Override
	public void showScore() {
		// TODO Auto-generated method stub

	}

	@Override
	public double calcWeightedScore() {
		double weightedScore = marks * Weightage.onlineAssessment.getWeight();
		return weightedScore;

	}

	@Override
	public void takeAssessment() {
		System.out.println("Online test done!");
	}

}
