package com;

public class Course {

	private int courseId;
	private String courseName;
	private int duration;
	private double fee;
	private int maxCapacity;
	private int noOfLearners;
	
	
	
	public void display() {
		System.out.println("Course Id: " + courseId);
		System.out.println("Name: " + courseName);
		System.out.println("Duration: " + duration);
		System.out.println("Fee: " + fee);
		System.out.println("-----------------------------");
	}

	

	public Course(int courseId, String courseName, int duration, double fee,int maxCapacity,int noOfLearners ) {

		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
		this.noOfLearners=noOfLearners;
	}

	
	
	
	public int getNoOfLearners() {
		return noOfLearners;
	}



	public void setNoOfLearners(int noOfLearners) {
		this.noOfLearners = noOfLearners;
	}



	public int getMaxCapacity() {
		return maxCapacity;
	}



	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}



	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}
