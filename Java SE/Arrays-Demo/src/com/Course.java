package com;

public class Course {

	private int courseID;
	private String courseName;
	private double fee;
	private int duration;
	private int maxCapacity;

	public Course(int courseID, String courseName, double fee, int duration, int maxCapacity) {
		this.courseID = courseID;
		this.courseName = courseName;
		this.fee = fee;
		this.duration = duration;
		this.maxCapacity = maxCapacity;
	}

	
	public void display() {
		System.out.println("Course Id: "+courseID);
		System.out.println("Name: "+courseName);
		System.out.println("Duration: "+duration);
		System.out.println("Fee: "+fee);
		System.out.println("Max Capacity: "+maxCapacity);
		System.out.println("----------------------------------");
	}
	
	
	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

}
