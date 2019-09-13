package com;

public class Student {

	private String name;
	private String maritalStatus;
	private int age;
	private char sex;
	private String dateOfBirth;
	private String address;
	private String primaryEmailId;
	private String secondaryEmaiId;
	private long phoneNumber;
	private String interestedSubject;
	private String highestEducationQualification;
	private String nationality;
	private String admissionId;
	private String result;
	private Exam exam; // exam class ref object

	public Student(String name, String maritalStatus, int age, char sex, String dateOfBirth, String address,
			String primaryEmailId, String secondaryEmaiId, long phoneNumber, String interestedSubject,
			String highestEducationQualification, String nationality) {

		this.name = name;
		this.maritalStatus = maritalStatus;
		this.age = age;
		this.sex = sex;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.primaryEmailId = primaryEmailId;
		this.secondaryEmaiId = secondaryEmaiId;
		this.phoneNumber = phoneNumber;
		this.interestedSubject = interestedSubject;
		this.highestEducationQualification = highestEducationQualification;
		this.nationality = nationality;

	}

	// Student class business logic methods

	public void registerStudent() {
		Registrar registrar = Registrar.getRegistrar();
		admissionId = registrar.registerStudent(this);
	}

	// ---------------------

	public void registerForExam() {
		ExamRegistrar examRegistrar = ExamRegistrar.getExamRegistrar();
		exam = examRegistrar.registeringStudentForExamination(this);

	}

	// -----------------------

	public String appearForExam() {
		Paper paper = exam.getPaper();
		result = paper.submit();
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public String getSecondaryEmaiId() {
		return secondaryEmaiId;
	}

	public void setSecondaryEmaiId(String secondaryEmaiId) {
		this.secondaryEmaiId = secondaryEmaiId;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getInterestedSubject() {
		return interestedSubject;
	}

	public void setInterestedSubject(String interestedSubject) {
		this.interestedSubject = interestedSubject;
	}

	public String getHighestEducationQualification() {
		return highestEducationQualification;
	}

	public void setHighestEducationQualification(String highestEducationQualification) {
		this.highestEducationQualification = highestEducationQualification;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}
