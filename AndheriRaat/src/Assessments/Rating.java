package Assessments;

public enum Rating {
	R1("VeryGood"), R2("Good"), R3("Bad"), R4("Die");
	
	private String rating;
	private Rating(String rating) {
		this.rating = rating;
	}
	
	public String getRating() {
		return rating;
	}
}
