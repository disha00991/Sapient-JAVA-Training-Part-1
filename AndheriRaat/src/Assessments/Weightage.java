package Assessments;

public enum Weightage {
	codingAssessment(0.50), onlineAssessment(0.30), classPerformance(0.20);
	
	private double weight;
	private Weightage(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
}