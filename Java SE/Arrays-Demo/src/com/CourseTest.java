package com;

public class CourseTest {

	public static void main(String[] args) {
		
		Course courseList[]=new Course[5];
		
		courseList[0]=new Course(10, "Abc", 1500, 100, 50);
		courseList[1]=new Course(11, "Xyz", 1900, 150, 20);
		courseList[2]=new Course(12, "Jkj", 4500, 120, 89);
		courseList[3]=new Course(13, "Sdf", 1200, 190, 75);
		courseList[4]=new Course(14, "Okj", 7500, 180, 45);
		
		
		for(Course course:courseList) {
			course.display();
		}
		
		
		
		
		

	}

}
