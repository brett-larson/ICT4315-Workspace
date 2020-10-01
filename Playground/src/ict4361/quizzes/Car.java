package ict4361.quizzes;

public class Car {
	
	private final String make;
	
	Car(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
